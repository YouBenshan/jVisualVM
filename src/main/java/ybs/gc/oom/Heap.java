package ybs.gc.oom;

import java.util.ArrayList;
import java.util.List;

public class Heap {

	public static void main(String[] args) throws InterruptedException {
		List<byte[]> list = new ArrayList<>();
		while (true) {
			byte[] data = new byte[1 << 13];
			list.add(data);
		}
	}

}
