Threads
==
Goal:
1. Get familiar with Java Thread state
2. Detect dead lock


Step:
Run:
java -XX:+UseParallelGC -Xmx2g ybs.gc.thread.LockContention
Observe	"Threads" Tab:
	Explain the colorful bars.
Observe: "Thread Dump" in "Threads" Tab:
	Expain the Contention of locks.
	
	
Run:
java -XX:+UseParallelGC -Xmx512m ybs.gc.thread.DeadLock
Observe: "Thread Dump" in "Threads" Tab:
	Get the dead lock.


Background Knowledge:
Java Doc of "java.lang.Thread.State"
"java.util.concurrent" Package


Q:
what is the state of "Parking" of Thread?
