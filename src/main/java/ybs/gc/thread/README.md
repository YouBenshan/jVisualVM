Threads
==
Goal:
--
	1. Get familiar with Java Thread state
	2. Detect dead lock


Step:
--
	Run: 
		java -XX:+UseParallelGC -Xmx2g ybs.gc.thread.LockContention
	Observe:
		"Threads" Tab:
	Q: 
		Explain the colorful bars. And read Java Doc of "java.lang.Thread.State".
	Q: 
		What is the state of "Parking" of Thread?
	Observe: 
		"Thread Dump" in "Threads" Tab:
	Q: 
		Expain the Contention of locks.
	
	
	Run: 
		java -XX:+UseParallelGC -Xmx512m ybs.gc.thread.DeadLock
	Observe: 
		"Thread Dump" in "Threads" Tab
		Get the dead lock.
	Q: 
		How to avoid dead lock?
