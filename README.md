gc
==
Goal:
1. Get familiar with JVM with jVisualVM
2. Detect bad smell of code using jVisualVM

Scenarios:
Code review is the best way to find bed smell of code. 
But sometimes you maybe asked to improve a legacy project. And even it contains some jar files that has no source code. How do you investigate the performance? 
Now the JVM that running the project will tell you some the project's secret.

Tool:
Oracle JDK
tested on: 
OS:	Windows 7 Professional-SP1, 64-bit
Processor:	Intel Core i7-4600U
RAM:	8G 
JDK: 1.8.0_20
Maven 3.2.2 and Eclipse 4.4 (Not necessary. It can be compile with javac from JDK)



KickOff: Get familiar with jVisualVM
1. install plugin: Visual GC, and restart
2. Observe a application's JVM with jVisualVM: 
	Scan every tabs: 
		Monitor, Thread, Sampler, Visual GC (and Profiler for Some Applications)
3. Scan these pages:
		http://visualvm.java.net/docindex.html
		http://visualvm.java.net/plugins.html
		http://docs.oracle.com/javase/8/docs/technotes/tools/windows/java.html
	We'll go deeper on the next steps.


Then you can go to next steps:

Minor and Full GC

Out Of Memory

Memory Leak

Resize of Container

Threads

High CPU Usage 


I recommend this book for JVM: 
Java Performance  -- Charlie Hunt, Binu John
And for Thread/Concurrent:
Java Concurrency in Practice  -- Brian Goetz, Tim Peierls, Joshua Bloch, Joseph Bowbeer, David Holmes, Doug Lea 