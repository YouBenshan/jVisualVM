Minor & Full GC
==
Goal:
--
* Observe Minor GC
* Feel Stop-The-World of Full GC


Step:
--
* Run:  
`java -XX:+UseParallelGC -Xms512m -Xmx512m ybs.gc.minorAndFull.Main`
* Observe:  
	 * `Overview` Tab:  
		The arguments of java command is show in this tab.
	 * `Monitor` Tab.
* Q: Explain the relationship between `GC activity/CPU usage` and change of `Heap Size`.  
	*`Heap Size` downs reflect the activities of GC. Small ones are `Minor GC`, big ones are 'Full GC'. Full GC needs much more cpu usage.*
* Observe: `Visual GC` Tab.
* Q: Explain Minor GC's process(ParallelGC).  
	*Keywords: `Eden`, `Suvior`, `age`, `threshold`.*
* Q: Explain Full GC's process(ParallelGC)?  
	*Keywords: `Mark-Compact` vs `Mark-Sweep`*
* Q: Which one has more impact the Full GC time: Survival instance size or Garbage size?  
	*Survival instance size*
* Q: Explain how to choose GC argument according to 3 attributes of Performance: Throughput, Latency, Footprint.  
	*-XX:+UseG1GC  
	-XX:+UseSerialGC  
	-XX:+UseConcMarkSweepGC  
	-XX:+UseParallelGC  
	-XX:+UseParallelOldGC  
	-XX:+UseParNewGC  
	-Xms  
	-Xmx*
		
* Observe: Full GC's Stop-The-World:  
		See the Stdout , normally the output value is <1050, but sometime is 1100~1300(around Full GC)
* Q: How about: java -XX:+UseParallelGC -Xms2G -Xmx2G ybs.gc.minorAndFull.Main (make sleep shorter)?  
	*The output numbers are much bigger then before*
* Q: Does Stop-The-World only existing during Full GC?  
	*No*
		
* Observe: Source code--SoftReference.
* Q: Compare it with other type of References.  
	*WeekReference will be collected when every GC activity.  
	SoftReference will not be collected until the heap will be out of memory.  
	Strong Reference will not be collected even heap will be out of memory.*


Tips:
--
* Full GC is Much expensive than Minor GC
* Don't instantiate object too early
* Think about instance pool


GOTO
--
###[Out Of Memory](../oom/README.md)
###[Index Page](../../../../../../README.md)
