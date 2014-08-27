package ybs.gc.oom;

public class StackOverFlow {

	private static int size=0;
	public static void main(String[] args) throws InterruptedException {
		size=Integer.valueOf(args[0]);
		f(1);
	}

	public static void f(int n) throws InterruptedException {
		Thread.sleep(2);
		Byte[] byteArray = new Byte[size];
		System.out.println(n);
		f(++n);
		System.out.println(byteArray.length);
	}
}
