Minor & Full GC
==
Goal:
--
* Observe Minor GC
* Observe Stop-The-World of Full GC


Step:
--
* Run:  
	`java -XX:+UseParallelGC -Xms256m -Xmx256m ybs.gc.minorAndFull.Main 4`
* Observe:  
	 * `Overview` Tab:  
		The arguments of java command is show in this tab.
	 * `Monitor` Tab.
* Q:   
	 * Explain the relationship between `GC activity/CPU usage` and change of `Heap Size`.  
	*The downs of `Heap Size` reflect the activities of GC. Small ones are `Minor GC`, big ones are 'Full GC'. Full GC needs much more CPU usage.*
* Observe:  
	 * `Visual GC` Tab.
* Q:  
	 * Explain `Minor GC`'s process(ParallelGC).  
	*Keywords: Eden, Suvior, age, threshold.*
	 * Explain Full GC's process(ParallelGC)?	  
	*Keywords: Mark-Compact vs Mark-Sweep*
	 * Explain how to choose GC argument according to 3 attributes of Performance: Throughput, Latency, Footprint.  
	-XX:+UseG1GC  
	-XX:+UseSerialGC  
	-XX:+UseConcMarkSweepGC  
	-XX:+UseParallelGC  
	-XX:+UseParallelOldGC  
	-XX:+UseParNewGC  
	-Xms  
	-Xmx  
	*Read the book "Java Performance" about G1, Serial, CMS, Parallel GC.*
		
* Observe:  
	 * Full GC's Stop-The-World:  
		See the Stdout , normally the output value is <1050, but sometime is 1100~1300(around Full GC)
* Q:  
	 * How about: `java -XX:+UseParallelGC -Xms2G -Xmx2G ybs.gc.minorAndFull.Main 1` (make sleep shorter)?  
	*The output numbers are much bigger then before for the heap are much bigger.*
	 * Does Stop-The-World only existing during Full GC?  
	*No*
		
* Observe:  
	 * Source code--SoftReference.
* Q:  
	 * Compare it with other type of References.  
	*WeekReference will be collected when every GC activity.  
	SoftReference will not be collected until the heap will be out of memory.  
	Strong Reference will not be collected even heap will be out of memory.*


Tips:
--
* Full GC is Much expensive than Minor GC
* Don't instantiate object too early
* Don't miss use instance pool


GOTO
--
###[Out Of Memory](../oom/README.md)
###[Index Page](../../../../../../README.md)
