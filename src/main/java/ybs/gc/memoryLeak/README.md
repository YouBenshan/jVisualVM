Memory Leak
==
Goal:
1. Detect memory leak

Q: What's the memory leak?

Step:
Run: java -XX:+UseParallelGC -Xmx256m ybs.gc.memoryLeak.Main
Observe:
	MemoryLeakObject's instance number in "Sample" Tab
Observer:
	Generation in "Profile" Tab.
	Q: Explain why some of classes have so many generations (compared to other classes)?
