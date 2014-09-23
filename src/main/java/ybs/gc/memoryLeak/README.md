Memory Leak
==
Goal:
--
* Detect memory leak


Step:
--
* Run:  
`java -XX:+UseParallelGC -Xmx256m ybs.gc.memoryLeak.Main`
* Observe:
	* `Memory` in `Sample` Tab  
	MemoryLeakObject's instance number keeps steady around "STACK_SIZE". Seems will never be GC.
	* `Memory` in `Profile` Tab. (Don't forget choose "Record allocations stack traces" in setting.)  
	`byte[]`'s generations keeps increasing.  
	* Take snapshot and show allocations stack traces  
	Only the generations of the byte[] allocated by MemoryLeakObject.<init> is very big. 
* Question: 
	* What's the memory leak?  
	*Some instances in the heap is out of date. They will be never be used, but for some reason they cannot be GC.*
	* Explain why some of classes have so many generations (compared to other classes)?  
	 *Normally, some instances will survive for a period. So their ages will distributed in a range.  
	 Some other instances will survive forever. And the quantity of this kind of instances is under control. For example, the generation of a Singleton Pattern instance is 1.  
	 But some instances will survive forever and the quantity keeps increasing. So the generations keeps increasing. (Memory Leak)*

		
GOTO
--
###[Container Resize](../resize/README.md)
###[Index Page](../../../../../../README.md)