package ybs.gc.util;

public class Utils {

	private Utils() {
	}

	public static void print1Sec(){
		new Thread(new Runnable(){
			@Override
			public void run() {
				while (true) {
					long start = System.currentTimeMillis();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					long end = System.currentTimeMillis();
					System.out.println(end - start);
				}
			}
		}).start();
	}
	
	public static void genInstance(int size, int millis){
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					Byte[] byteArray = new Byte[size];
					try {
						Thread.sleep(millis);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
}
