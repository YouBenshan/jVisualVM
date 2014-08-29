Memory Leak
==
Goal:
1. Detect memory leak

Q:
What's the memory leak?

Step:
java -XX:+UseParallelGC -Xmx256m ybs.gc.memoryLeak.Main

Observe:
	MemoryLeakObject's instance number in "Sample" Tab

Observer:
	Generation in "Profile" Tab.


Background Knowledges:
Generation(age) of instance?

Q:
Would you please explain why some of classes have so many generations (compared to other classes)?
