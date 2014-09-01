Observe JVM with jVisualVM
==
Goal:
--
1. Get familiar with JVM with jVisualVM
2. Detect bad smell of code using jVisualVM

Scenarios:
--
Code review is the best way to find bed smell of code. <br/>
But sometimes you may be asked to improve a legacy project. And even it contains some jar files that has no source code. How do you investigate the performance?  <br/>
Now the JVM that running the project will tell you some the project's secret.

Tool:
--
tested on:  <br/>
OS:	Windows 7 Professional-SP1, 64-bit <br/>
CPU:	Intel Core i7-4600U <br/>
RAM:	8G  <br/>
JDK: 1.8.0_20 <br/>
Maven 3.2.2 and Eclipse 4.4 (Not necessary. It can be compile with javac from JDK)


Step:
--
###KickOff: Get familiar with jVisualVM
1. install plugin: Visual GC, and restart
2. Observe a application's JVM with jVisualVM: <br/>
	Scan every tabs: <br/>
		Monitor, Thread, Sampler, Visual GC (and Profiler for Some Applications)
3. Scan these pages:<br/>
		[jVisualVM Documentation](http://visualvm.java.net/docindex.html)<br/>
		[jVisualVM Plugins](http://visualvm.java.net/plugins.html)<br/>
		[JVM Arguments](http://docs.oracle.com/javase/8/docs/technotes/tools/windows/java.html)<br/>

Then you can go to next steps:

###[Minor and Full GC](src\main\java\ybs\gc\thread\README.md)

###Out Of Memory

###Memory Leak

###Resize of Container

###Threads

###High CPU Usage 

Conclusion:
--
I recommend this book for JVM: 
Java Performance  -- Charlie Hunt, Binu John
And for Thread/Concurrent:
Java Concurrency in Practice  -- Brian Goetz, Tim Peierls, Joshua Bloch, Joseph Bowbeer, David Holmes, Doug Lea 
