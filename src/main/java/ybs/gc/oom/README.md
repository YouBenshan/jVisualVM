Out Of Memory
==
Goal:
--
* Explain how Out Of Memory happens.


Step:
--
###Heap:
* Run:  
	`java -XX:+UseParallelGC -Xmx512m ybs.gc.oom.Heap`
* Question:  
	* How to dump the heap in product environment?  
	*java -XX:+UseParallelGC -Xmx512m -XX:+HeapDumpOnOutOfMemoryError ybs.gc.oom.Heap  
	Download "xxx.hprof" file from product environment  
	Use JVisualVM to observe the "xxx.hprof" file*

###Metaspace:
* Run:  
	`java -XX:+UseParallelGC -Xmx2G -XX:MaxMetaspaceSize=128m ybs.gc.oom.MataSpace small`
* Observe:  
	* `Metaspace` of `Monitor` Tab
* Question:  
	* How to make Meta Space OOM quicker?  
	*Make the Max Meta Space smaller:  
	`java -XX:+UseParallelGC -Xmx2G -XX:MaxMetaspaceSize=64m ybs.gc.oom.MataSpace small`  
	Make the value of ClassToLoad.CONSTANT bigger:  
	`java -XX:+UseParallelGC -Xmx2G -XX:MaxMetaspaceSize=64m ybs.gc.oom.MataSpace big`*
	* Where is ClassToLoad.CONSTANT stored?  
	*Meta Space*

###Stack:
* Run:  
	`java -XX:+UseParallelGC -Xmx512m ybs.gc.oom.StackOverFlow 1`

* Question:  
	* Run `java -XX:+UseParallelGC -Xmx512m ybs.gc.oom.StackOverFlow 1024` and compare the Max output number. Why they are nearly the same?  
	*The byteArray instance is stored in heap. The stack only have a reference to the byteArray instance.*  
	* How to make the Max output number larger?  
	*Increase stack size -Xsssize:  
	`java -XX:+UseParallelGC -Xmx512m -Xss2m ybs.gc.oom.StackOverFlow 1`  
	Remove some local variables ("byteArrayX")*
* Observe:  
	* `Thread Dump` in `Threads` Tab.


GOTO
--
###[Memory Leak](../memoryLeak/README.md)
###[Index Page](../../../../../../README.md)