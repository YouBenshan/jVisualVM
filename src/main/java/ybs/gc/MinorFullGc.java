package ybs.gc;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

public class MinorFullGc {

	private static final List<SoftReference<Byte[]>> references = new ArrayList<>();

	public static void main(String[] args) throws InterruptedException {

		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					Byte[] byteArray = new Byte[1 << 13];
					SoftReference<Byte[]> reference = new SoftReference<>(
							byteArray);
					references.add(reference);
					try {
						Thread.sleep(4);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					Byte[] byteArray = new Byte[1 << 13];
					SoftReference<Byte[]> reference = new SoftReference<>(
							byteArray);
					// references.add(reference);
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();

		while (true) {
			long start = System.currentTimeMillis();
			Thread.sleep(1000);
			long end = System.currentTimeMillis();
			System.out.println(end - start);
		}

	}

}
