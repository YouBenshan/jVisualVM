package ybs.gc.thread;

import java.io.IOException;

public class DeadLock {
	
	public static void main(String[] args) throws IOException {
		Object mutex0 = new Object();
		Object mutex1 = new Object();
		
		new Thread(new Locker(mutex0,mutex1), "T1").start();
		new Thread(new Locker(mutex1,mutex0), "T2").start();
	}
	
	public static class Locker implements Runnable{

		private Object mutexA;
		private Object mutexB;
		
		public Locker(Object mutexA, Object mutexB){
			this.mutexA=mutexA;
			this.mutexB=mutexB;
		}
		
		@Override
		public void run() {
			while(true){
				synchronized(mutexA){
					try {
						Thread.sleep(500);
						System.out.println(Thread.currentThread().getName()+":ping");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized(mutexB){
						try {
							Thread.sleep(500);
							System.out.println(Thread.currentThread().getName()+":pong");
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
			
		}
		
	}

}
