package ybs.gc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BIO {

	public static void main(String[] args) throws IOException {
		File file = File.createTempFile("tmp", "tmp");
		try (FileWriter fw = new FileWriter(file)) {

			long start = System.currentTimeMillis();
			for (int i = 0; i < (1 << 29); i++) {
				fw.write("abc");
			}
			long end = System.currentTimeMillis();
			System.out.println(end - start);

		}
		System.out.println(file.length());
	}

}
