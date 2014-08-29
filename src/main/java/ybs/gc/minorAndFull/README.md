Minor & Full GC
==
Goal:
1. Observe Minor GC
2. Feel Stop-The-World of Full GC


Step:

Run: 
	java -XX:+UseParallelGC -Xms512m -Xmx512m ybs.gc.minorAndFull.Main
Observe:
	"Overview" Tab.
		The arguments of java command is show in this tab.
	"Monitor" Tab.
		Would you please explain the relationship between "GC activity/CPU usage" and change of "Heap Size"? 
	"Visual GC" Tab.
		Q: Explain Minor GC's process(ParallelGC)?
			Keywords: Eden, Suvior, age, threshold.
		Q: Explain Full GC's process(ParallelGC)?
			Mark-Compact vs Mark-Sweep
		Q: Which one has more impact the Full GC time: Survival instance size or Garbage size?
			Survival instance size
		Q: does Stop-The-World only existing during Full GC?
			No
		Q: Explain how to choose GC argument according to 3 attributes of Performance: Throughput, Latency, Footprint.  
			-XX:+UseG1GC
			-XX:+UseSerialGC
			-XX:+UseConcMarkSweepGC
			-XX:+UseParallelGC
			-XX:+UseParallelOldGC
			-XX:+UseParNewGC
			-Xms
			-Xmx
Feel about Full GC's Stop-The-World: 
	See the Stdout , normally the output value is <1050, but sometime is 1100~1300(around Full GC)
	How about: java -XX:+UseParallelGC -Xms2G -Xmx2G ybs.gc.minorAndFull.Main (make sleep shorter)
	
	
Background Knowledges:
SoftReference(used in source code)
	Read the java doc
	Compare with other type of References

Tips:
Full GC is Much expensive than Minor GC
Don't instantiate object too early
Think about instance pool