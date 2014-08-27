package ybs.gc.memoryLeak;

import ybs.gc.util.LeakStack;
import ybs.gc.util.MemoryLeakObject;
import ybs.gc.util.Utils;

public class Main {

	private static int STACK_SIZE=1<<18;
	
	public static final LeakStack stack = new LeakStack();
	
	public static void main(String[] args) throws InterruptedException {

		Utils.genInstance(1<<13,1);
		
		for (int i = 0; i < STACK_SIZE; i++) {
			stack.push(new MemoryLeakObject());
		}
		
		System.out.println("stack size: "+stack.size());
		
		for (int i = 0; i < STACK_SIZE; i++) {
			stack.pop();
		}
		
		System.out.println("stack size: "+stack.size());
		
		
		while(true){
			MemoryLeakObject memoryLeakObject = new MemoryLeakObject();
			stack.push(memoryLeakObject);
			System.out.println(stack.size());
			Thread.sleep(100);
		}
	}
}
