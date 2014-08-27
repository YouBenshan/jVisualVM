Thread
==
Goal:
1. Get familiar with Java Thread state
2. Detect dead lock

Step:
java -XX:+UseParallelGC -Xmx2g ybs.gc.thread.LockContention
Observe Threads Tab. Explain the colorful bar.


java -XX:+UseParallelGC -Xmx512m ybs.gc.thread.DeadLock
Tread dump: Observe the locks