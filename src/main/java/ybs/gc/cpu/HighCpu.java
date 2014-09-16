package ybs.gc.cpu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class HighCpu {

	public static void main(String[] args) throws IOException, InterruptedException {
	
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
		
		new Thread(new Runnable(){
			@Override
			public void run() {
				mix();
			}
		}, "mix").start();
	}

	private static void write() {
		long start = System.currentTimeMillis();
		File file;
		try {
			file = File.createTempFile("tmp", "tmp");
			try (FileWriter fw = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(fw, 1<<15);
					) {
				for (int i = 0; i < (1 << 30); i++) {
					bw.write("a");
					bw.flush(); //Wrong!
				}
			}
			file.delete();
		} catch (IOException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("write task time: "+ (end - start));
		
	}
	
	private static void random() {
		long start = System.currentTimeMillis();
		
		int v=0;
		for(long i=0;i<Long.MAX_VALUE; i++){
			Random random=new Random(); //Wrong!
			int r=random.nextInt();
			v+=r;
			
		}
		long end = System.currentTimeMillis();
		System.out.println("random task time: "+ (end - start));
		System.out.println(v);
	}
	
	private static void mix() {
		
		while(true){
		File file;
		try {
			file = File.createTempFile("tmp", "tmp");
			try (FileWriter fw = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(fw, 1<<10);
					) {
				for (int i = 0; i < (1 << 20); i++) {
					bw.write("a");
					bw.flush(); //Wrong!
				}
			}
			file.delete();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		int v=0;
		for(int i=0;i<(1 << 20); i++){
			Random random=new Random(); //Wrong!
			int r=random.nextInt();
			v+=r;
			
		}
		System.out.println(v);
		}
	}

}
