Out Of Memory
==
Goal:
1. explain How Out Of Memory happens.


Step:
Heap:
java -XX:+UseParallelGC -Xmx512m ybs.gc.oom.Heap


Metaspace:
Observe "Metaspace" of "Monitor" Tab
java -XX:+UseParallelGC -Xmx512m -XX:MaxMetaspaceSize=256m ybs.gc.oom.MataSpace

Q:
How to make Metaspace OOM quicker?
	1. change value of ClassToLoad.ClassToLoad from 1<<12 to 1<<16
	2. java -XX:+UseParallelGC -Xmx512m -XX:MaxMetaspaceSize=64m ybs.gc.oom.MataSpace
Where is ClassToLoad.class stored?


Stack:
java -XX:+UseParallelGC -Xmx512m ybs.gc.oom.StackOverFlow 1
java -XX:+UseParallelGC -Xmx512m ybs.gc.oom.StackOverFlow 8192

Q:
Compare the Max output number. Why they are nealy the same?
How to make the Max output number larger?
	1. java -XX:+UseParallelGC -Xmx512m -Xss2m ybs.gc.oom.StackOverFlow 1
	2. remove local variable

Make StackOverFlow slower and using "Thread Dump" in "Threads" Tab.


Run:
java -XX:+UseParallelGC -Xmx512m -XX:+HeapDumpOnOutOfMemoryError ybs.gc.oom.Heap
Use JVisualVM to observe the "xxx.hprof" file