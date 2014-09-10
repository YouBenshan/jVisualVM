Threads
==
Goal:
--
* Get familiar with Java Thread state
* Detect dead lock


Step:
--
* Run:  
	`java -XX:+UseParallelGC -Xmx2g ybs.gc.thread.LockContention`
* Observe:
	* "Threads" Tab:
* Q: 
	* Explain the colorful bars. And read Java Doc of "java.lang.Thread.State".  
	* What is the state of "Parking" of Thread?  
	*sun.misc.Unsafe.park(boolean, long)*
* Observe: 
	`Thread Dump` in `Threads` Tab:
* Q: 
	* Explain the Contention of locks.
	
* Run:  
`java -XX:+UseParallelGC -Xmx512m ybs.gc.thread.DeadLock`
* Observe: 
	* `Thread Dump` in `Threads` Tab  
		Get the dead lock.
* Q: 
	* How to avoid dead lock?  


GOTO
--
###[High CPU Usage](../cpu/README.md)
###[Index Page](../../../../../../README.md)