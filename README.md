gc
==


cd D:\workspaces\test\gc\target\classes
d:

-XX:+UseG1GC
-XX:+UseSerialGC
-XX:+UseConcMarkSweepGC
-XX:+UseParallelGC
-XX:+UseParallelOldGC
-XX:+UseParNewGC


1
-XX:+UseConcMarkSweepGC
-XX:+UseParallelGC
java -XX:+UseConcMarkSweepGC -Xms512m -Xmx512m ybs.gc.MinorFullGc

2
-XX:+UseG1GC
-XX:+UseSerialGC
-XX:+UseConcMarkSweepGC
-XX:+UseParallelGC
java -XX:+UseSerialGC -Xms4g -Xmx4g ybs.gc.StopTheWorld


java -XX:+UseSerialGC -XX:MaxMetaspaceSize=80m ybs.gc.OomPermGen

java -XX:+UseSerialGC -Xmx128m ybs.gc.OomHeap



java ybs.gc.StackOverFlow

java -XX:+UseSerialGC -Xmx128m ybs.gc.MemoryLeak


java -XX:+UseSerialGC -Xmx128m ybs.gc.Resize


java -XX:+UseParallelGC -Xmx512m ybs.gc.LockContention


java ybs.gc.PromotionFailure