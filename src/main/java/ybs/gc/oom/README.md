Out Of Memory
==
Goal:
--
* Explain How Out Of Memory happens.


Step:
--
###Heap:
* Run:  
	`java -XX:+UseParallelGC -Xmx512m ybs.gc.oom.Heap`
* Q:  
	* How to dump the heap in product environment?  
	*java -XX:+UseParallelGC -Xmx512m -XX:+HeapDumpOnOutOfMemoryError ybs.gc.oom.Heap  
	Use JVisualVM to observe the "xxx.hprof" file*

###Metaspace:
* Run:  
	`java -XX:+UseParallelGC -Xmx512m -XX:MaxMetaspaceSize=256m ybs.gc.oom.MataSpace`
* Observe:  
	* `Metaspace` of `Monitor` Tab
* Q:  
	* How to make Metaspace OOM quicker?  
	*1. Change value of ClassToLoad.CONSTANT from 1<<12 to 1<<16  
	2. java -XX:+UseParallelGC -Xmx512m -XX:MaxMetaspaceSize=64m ybs.gc.oom.MataSpace*
	* Where is ClassToLoad.CONSTANT stored?
	*`meta space`*

###Stack:
* Run:  
	`java -XX:+UseParallelGC -Xmx512m ybs.gc.oom.StackOverFlow 1`

* Q:  
	* Run "java -XX:+UseParallelGC -Xmx512m ybs.gc.oom.StackOverFlow 8192" and compare the Max output number.  
		Why they are nearly the same?  
	* How to make the Max output number larger?
	*1. java -XX:+UseParallelGC -Xmx512m -Xss2m ybs.gc.oom.StackOverFlow 1
	2. remove local variable*
* Observe:  
	* `Thread Dump` in `Threads` Tab.


GOTO
--
###[Memory Leak](../memoryLeak/README.md)
###[Index Page](../../../../../../README.md)