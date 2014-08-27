package ybs.gc.oom;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class MataSpace {

	private static final List<Object> list = new ArrayList<>();

	public static void main(String[] args) throws URISyntaxException, IOException, ClassNotFoundException, InterruptedException, InstantiationException, IllegalAccessException{
		URL url = MataSpace.class.getResource("/"+ClassToLoad.class.getName().replace(".", "/")+".class");
		Path path = Paths
				.get(url.toURI());
		byte[] data = Files.readAllBytes(path);
		int i=0;
		while (true) {
			
			MyClassLoader myclassLoader1 = new MyClassLoader();
			Class<?> clazz1 = myclassLoader1.findClass(data);
			Object classToLoad = clazz1.newInstance();
			System.out.println(++i);
			list.add(classToLoad);

			Thread.sleep(2);
		}
	}

	public static class MyClassLoader extends ClassLoader {
		public Class<?> findClass(byte[] data) throws ClassNotFoundException {
			return super.defineClass(null, data, 0, data.length);
		}
	}
	
}
