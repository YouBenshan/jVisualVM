package ybs.gc.oom;

public class StackOverFlow {

	private static int size=0;
	public static void main(String[] args) throws InterruptedException {
		size=Integer.valueOf(args[0]);
		f(1);
	}

	public static void f(int n) throws InterruptedException {
		Thread.sleep(2);
		Byte[] byteArray0 = new Byte[size];
		Byte[] byteArray1 = new Byte[size];
		Byte[] byteArray2 = new Byte[size];
		Byte[] byteArray3 = new Byte[size];
		Byte[] byteArray4 = new Byte[size];
		Byte[] byteArray5 = new Byte[size];
		Byte[] byteArray6= new Byte[size];
		Byte[] byteArray7 = new Byte[size];
		Byte[] byteArray8 = new Byte[size];
		Byte[] byteArray9 = new Byte[size];
		System.out.println(n);
		f(++n);
		System.out.println(byteArray0.length);
		System.out.println(byteArray1.length);
		System.out.println(byteArray2.length);
		System.out.println(byteArray3.length);
		System.out.println(byteArray4.length);
		System.out.println(byteArray5.length);
		System.out.println(byteArray6.length);
		System.out.println(byteArray7.length);
		System.out.println(byteArray8.length);
		System.out.println(byteArray9.length);
	}
}
