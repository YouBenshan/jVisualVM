package ybs.gc.cpu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class WrongFlush {

	public static void main(String[] args) throws IOException, InterruptedException {
		new Thread(new Runnable(){
			@Override
			public void run() {
				add();
			}
		}, "add").start();
		new Thread(new Runnable(){
			@Override
			public void run() {
				write();
			}
		}, "write").start();
		new Thread(new Runnable(){
			@Override
			public void run() {
				random();
			}
		}, "random").start();
	}

	private static void write() {
		long start = System.currentTimeMillis();
		File file;
		try {
			file = File.createTempFile("tmp", "tmp");
			try (FileWriter fw = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(fw, 64*1024);
					) {
				for (int i = 0; i < (1 << 30); i++) {
					bw.write("a");
					bw.flush();
				}
			}
			file.delete();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("write task time: "+ (end - start));
		
	}
	
	private static void add(){
		long start = System.currentTimeMillis();
		int v=0;
		for(int i=0;i<Integer.MAX_VALUE; i++){
			v++;
		}
		long end = System.currentTimeMillis();
		System.out.println("add task time: "+ (end - start));
		System.out.println(v);
	}
	
	private static void random() {
		long start = System.currentTimeMillis();
		
		int v=0;
		for(long i=0;i<1<<30; i++){
			Random random=new Random();
			int r=random.nextInt();
			v+=r;
			
		}
		long end = System.currentTimeMillis();
		System.out.println("random task time: "+ (end - start));
		System.out.println(v);
	}

}
