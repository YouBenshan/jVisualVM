package ybs.gc;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class OomPermGen {

	private static final List<Object> list = new ArrayList<>();

	public static void main(String[] args) throws ClassNotFoundException,
			IOException, URISyntaxException, InstantiationException,
			IllegalAccessException, InterruptedException {
		Path path = Paths
				.get("D:/workspaces/test/gc/target/classes/ybs/gc/util/ClassToLoad.class");
		byte[] data = Files.readAllBytes(path);
		while (true) {
			MyClassLoader myclassLoader1 = new MyClassLoader();
			Class<?> clazz1 = myclassLoader1.findClass(data);
			Object classToLoad = clazz1.newInstance();

			list.add(classToLoad);

			Thread.sleep(1);
		}
	}

	public static class MyClassLoader extends ClassLoader {
		public Class<?> findClass(byte[] data) throws ClassNotFoundException {
			return super.defineClass(null, data, 0, data.length);
		}
	}
}
