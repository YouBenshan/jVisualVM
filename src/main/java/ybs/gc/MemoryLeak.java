package ybs.gc;

import ybs.gc.util.MemoryLeakObject;
import ybs.gc.util.LeakStack;

public class MemoryLeak {

	public static final LeakStack stack = new LeakStack();
	
	public static void main(String[] args) throws InterruptedException {

		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					Byte[] byteArray = new Byte[1 << 13];
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();

		
		for (int i = 0; i < 1<<18; i++) {
			MemoryLeakObject memoryLeakObject = new MemoryLeakObject();
			stack.push(memoryLeakObject);
		}
		
		System.out.println(stack.size());
		
		for (int i = 0; i < 1<<18; i++) {
			stack.pop();
		}
		
		System.out.println(stack.size());
		
		while(true){
				MemoryLeakObject memoryLeakObject = new MemoryLeakObject();
				stack.push(memoryLeakObject);
			
			System.out.println(stack.size());
			Thread.sleep(100);
			
		
		}
		
		
		
		
	}

}
