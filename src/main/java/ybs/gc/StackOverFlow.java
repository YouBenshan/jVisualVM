package ybs.gc;

public class StackOverFlow {

	public static void main(String[] args) throws InterruptedException {
		f(1 << 13);
	}

	public static void f(int n) throws InterruptedException {
		Thread.sleep(3);
		// Byte[] byteArray = new Byte[1 << 12];
		System.out.println(n);
		if (n > 0) {
			f(--n);
		}

	}

}
