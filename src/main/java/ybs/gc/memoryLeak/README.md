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
	* MemoryLeakObject's instance number in `Sample` Tab
	* Generation in `Profile` Tab.
* Q: 
	* What's the memory leak?  
	*Some instances in the heap is out of date. They will be never be used, but for some reason they cannot be GC.*
	* Explain why some of classes have so many generations (compared to other classes)?  
	 *Normally, some instances will survive for a period. So their ages will distributed in a range.  
	 another instances will survive forever. And the quantity of this kind of instances is under control. For example,, the generation of a Singleton Pattern instance is 1.  
	 But some instances will survive forever and the number keeps increasing. So the generations keeps increasing.*

		
GOTO
--
###[Container Resize](../resize/README.md)
###[Index Page](../../../../../../README.md)