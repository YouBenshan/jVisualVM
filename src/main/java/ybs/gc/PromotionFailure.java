package ybs.gc;

public class PromotionFailure {

	public static void main(String[] args) throws InterruptedException {
		while (true) {
			byte[] bs = new byte[8 * 1024 * 1024];
			Thread.sleep(1000);
			System.out.print(bs.length);
		}
	}
}
