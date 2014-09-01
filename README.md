Observe JVM with jVisualVM
==
Goal:
--
	1. Get familiar with JVM with jVisualVM
	2. Detect bad smell of code using jVisualVM

Scenarios:
--
	Code review is the best way to find bed smell of code.
	But sometimes you may be asked to improve a legacy project. And even it contains some jar files that has no source code. How do you investigate the project?
	Now the JVM that running the project will tell you some the project's secret.

Tool:
--
	tested on:
	OS:	Windows 7 Professional-SP1, 64-bit
	CPU:	Intel Core i7-4600U
	RAM:	8G
	JDK: 1.8.0_20
	Maven 3.2.2 and Eclipse 4.4 (Not necessary. It can be compile with javac from JDK)


Step:
--
###KickOff: Get familiar with jVisualVM
	1. install plugin: Visual GC, and restart
	2. Observe a application's JVM with jVisualVM:
		Scan every tabs:
			Monitor, Thread, Sampler, Visual GC (and Profiler for Some Applications)
	3. Scan these pages:
		[jVisualVM Documentation](http://visualvm.java.net/docindex.html)
		[jVisualVM Plugins](http://visualvm.java.net/plugins.html)
		[JVM Arguments](http://docs.oracle.com/javase/8/docs/technotes/tools/windows/java.html)

###Then you can go to next steps:

###[Minor and Full GC](src\main\java\ybs\gc\minorAndFull\README.md)

###[Out Of Memory](src\main\java\ybs\gc\oom\README.md)

###[Memory Leak](src\main\java\ybs\gc\memoryLeak\README.md)

###[Resize of Container](src\main\java\ybs\gc\resize\README.md)

###[Threads](src\main\java\ybs\gc\thread\README.md)

###[High CPU Usage ](src\main\java\ybs\gc\cpu\README.md)

Conclusion:
--
	I recommend this book for JVM:
		Java Performance  -- Charlie Hunt, Binu John
	And for Thread/Concurrent:
		Java Concurrency in Practice  -- Brian Goetz, Tim Peierls, Joshua Bloch, Joseph Bowbeer, David Holmes, Doug Lea 
