package ybs.gc;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockContention {

	private static final int SIZE = 2 << 20;

	public static void main(String[] args) throws InterruptedException {
		Map<Integer, Integer> map1 = new ConcurrentHashMap<>();
		Map<Integer, Integer> map2 = Collections
				.synchronizedMap(new HashMap<Integer, Integer>());
		Map<Integer, Integer> map3 = new SyncMap<>();
		Map<Integer, Integer> map4 = new LockMap<>();

		for (int i = 0; i < 10; i++) {
			new Thread(new Adder(map1), "adder1-" + i).start();
			new Thread(new Adder(map2), "adder2-" + i).start();
			new Thread(new Adder(map3), "adder3-" + i).start();
			new Thread(new Adder(map4), "adder4-" + i).start();
			new Thread(new Remover(map1), "remover1-" + i).start();
			new Thread(new Remover(map2), "remover2-" + i).start();
			new Thread(new Remover(map3), "remover3-" + i).start();
			new Thread(new Remover(map4), "remover4-" + i).start();
		}
	}

	public static class Adder implements Runnable {

		Map<Integer, Integer> map;

		public Adder(Map<Integer, Integer> map) {
			this.map = map;
		}

		@Override
		public void run() {
			while (true) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for (int i = 0; i < SIZE; i++) {
					map.put(i, i);
				}
			}
		}
	}

	public static class Remover implements Runnable {

		Map<Integer, Integer> map;

		public Remover(Map<Integer, Integer> map) {
			this.map = map;
		}

		@Override
		public void run() {
			while (true) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for (int i = 0; i < SIZE; i++) {
					map.remove(i);
				}
			}
		}
	}

	public static class SyncMap<K, V> extends HashMap<K, V> {
		private static final long serialVersionUID = 5636963939129221882L;
		private Object mutex = new Object();

		@Override
		public V remove(Object key) {

			synchronized (mutex) {
				V v;
				while ((v = super.remove(key)) == null) {
					try {
						mutex.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				mutex.notifyAll();
				return v;
			}
		}

		@Override
		public V put(K key, V value) {
			synchronized (mutex) {

				while (super.get(key) != null) {
					try {
						mutex.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				V v = super.put(key, value);
				mutex.notifyAll();
				return v;
			}
		}

	}

	public static class LockMap<K, V> extends HashMap<K, V> {
		private static final long serialVersionUID = 5636963939129221882L;
		private Lock lock = new ReentrantLock();
		private Condition puttable = lock.newCondition();
		private Condition removable = lock.newCondition();

		@Override
		public V remove(Object key) {

			lock.lock();
			try {
				V v;
				while ((v = super.remove(key)) == null) {
					try {
						removable.await();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				puttable.signalAll();
				return v;
			} finally {
				lock.unlock();
			}

		}

		@Override
		public V put(K key, V value) {
			lock.lock();
			try {
				while (super.get(key) != null) {
					try {
						puttable.await();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				V v = super.put(key, value);
				removable.signalAll();
				return v;
			} finally {
				lock.unlock();
			}
		}

	}
}
