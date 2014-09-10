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
	* Explain why some of classes have so many generations (compared to other classes)?  

		
GOTO
--
###[Container Resize](../resize/README.md)
###[Index Page](../../../../../../README.md)