Presentation: Observe JVM using jVisualVM
==
Goal:
--
* Get familiar with JVM with jVisualVM
* Detect bad smell of code using jVisualVM

Scenarios:
--
Code review is still the best way to find bed smell of code.  
JVM profiling is another option, when you improve a legacy project/jar, and even when it has a lot of dependences. You have no time to read the code one by one.  
The JVM will give you some clues to bad smell of code and bottleneck of performance.

Tool:
--
Have been tested on:  
OS:		Windows 7 Professional-SP1, 64-bit  
CPU:	Intel Core i7-4600U  
RAM:	8G  
JDK:	1.8.0_20  
Optional:  
Maven:	3.2.2  
Eclipse:	4.4


Step:
--
###KickOff: Get familiar with jVisualVM
* install plugin: Visual GC, and restart  
* Observe a application's JVM with jVisualVM:  
	* Scan every tabs:
	`Monitor`, `Thread`, `Sampler`, `Visual GC` (and Profiler for Some Applications)
* Scan these pages:  
	* [jVisualVM Documentation](http://visualvm.java.net/docindex.html)
	* [jVisualVM Plugins](http://visualvm.java.net/plugins.html)
	* [JVM Arguments](http://docs.oracle.com/javase/8/docs/technotes/tools/windows/java.html)

###Next Steps:

* [Minor and Full GC](src/main/java/ybs/gc/minorAndFull/README.md)
* [Out Of Memory](src/main/java/ybs/gc/oom/README.md)
* [Memory Leak](src/main/java/ybs/gc/memoryLeak/README.md)
* [Container Resize](src/main/java/ybs/gc/resize/README.md)
* [Threads](src/main/java/ybs/gc/thread/README.md)
* [High CPU Usage](src/main/java/ybs/gc/cpu/README.md)

References:
--
* [Java Performance](http://www.informit.com/store/java-performance-9780137142521)
* [Java Concurrency in Practice](http://www.informit.com/store/java-concurrency-in-practice-9780321349606)
