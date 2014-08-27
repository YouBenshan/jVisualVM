package ybs.gc.minorAndFull;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

import ybs.gc.util.Utils;

public class Main {

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

		Utils.print1Sec();

	}

}
