Out Of Memory
==
Goal:
1. explain How Out Of Memory happens


Step:
Heap:
java -XX:+UseParallelGC -Xmx512m ybs.gc.oom.Heap



Metaspace:
Observe Metaspace of Monitor tab
java -XX:+UseParallelGC -Xmx512m -XX:MaxMetaspaceSize=256m ybs.gc.oom.MataSpace

Make oom quicker and Compare:
change value of ClassToLoad.ClassToLoad from 1<<12 to 1<<16
java -XX:+UseParallelGC -Xmx512m -XX:MaxMetaspaceSize=64m ybs.gc.oom.MataSpace
Where  is ClassToLoad.ClassToLoad stored?



Stack:
java -XX:+UseParallelGC -Xmx512m ybs.gc.oom.StackOverFlow 1
java -XX:+UseParallelGC -Xmx512m ybs.gc.oom.StackOverFlow 8192
Compare the Max output number.
How to make the Max output number larger?
	1. java -XX:+UseParallelGC -Xmx512m -Xss2m ybs.gc.oom.StackOverFlow 1
	2. remove local variable
Thread Dump