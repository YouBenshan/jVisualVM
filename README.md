gc
==
Goal:
1. Get familiar with JVM with jVisualVM
2. detect bad smell code using jVisualVM

Tool:
Oracle JDK
tested on: 
OS:	Windows 7 Professional-SP1, 64-bit
Processor:	Intel Core i7-4600U
RAM:	8G 
JDK: 1.8.0_20
Maven 3.2.2 and Eclipse 4.4 (Not necessary)

Step:

Get familiar with jVisualVM
install plugin: Visual GC, and restart
Observe a application's JVM -- jVisualVM: 
	Scan every tabs: 
		Monitor, Thread, Sampler, Visual GC (and Profiler for Some Applications)
	Scan these pages:
		http://visualvm.java.net/docindex.html
		http://visualvm.java.net/plugins.html
		http://docs.oracle.com/javase/8/docs/technotes/tools/windows/java.html
We'll go deeper on the next steps.






-XX:+UseG1GC
-XX:+UseSerialGC
-XX:+UseConcMarkSweepGC
-XX:+UseParallelGC
-XX:+UseParallelOldGC
-XX:+UseParNewGC


java -XX:+UseParallelGC -Xmx2g ybs.gc.BIO

java -XX:+UseParallelGC -Xmx512m ybs.gc.LockContention


java ybs.gc.PromotionFailure