Memory Leak
==
Goal:
1. Detect memory leak

Step:
java -XX:+UseParallelGC -Xmx256m ybs.gc.memoryLeak.Main

Observe MemoryLeakObject's instance number in Sample tab
-XX:+HeapDumpOnOutOfMemory

Observer Generation in Profile tab.

Would you please explain why some of classes have so many generations?