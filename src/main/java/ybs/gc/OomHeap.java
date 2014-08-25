package ybs.gc;

import java.util.ArrayList;
import java.util.List;

public class OomHeap {

	private static final List<byte[]> list = new ArrayList<>();

	public static void main(String[] args) throws InterruptedException {

		while (true) {
			byte[] data = new byte[2 << 12];
			list.add(data);

			Thread.sleep(1);
		}
	}

}
