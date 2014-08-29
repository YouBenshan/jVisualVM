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
		Would you please explain the relationship between GC activity with changes of Heap Size and CPU usage? 
	"Visual GC" Tab.


Background Knowledges:
Explanation of these parameters
-XX:+UseG1GC
-XX:+UseSerialGC
-XX:+UseConcMarkSweepGC
-XX:+UseParallelGC
-XX:+UseParallelOldGC
-XX:+UseParNewGC
-Xms
-Xmx

The type of GCor.
The process of Minor GC (for -XX:+UseParallelGC).
The process of Full GC (for -XX:+UseParallelGC).


Feel about Full GC's Stop-The-World: 
	See the Stdout , normally the output value is <1050, but sometime is 1100~1300(around Full GC)
	How about: java -XX:+UseParallelGC -Xms2G -Xmx2G ybs.gc.minorAndFull.Main (make sleep shorter)
	
	
Background Knowledges:
SoftReference
	Read the java doc
	Compare with other type of References


Tips:
Full GC is Much expensive than Minor GC
Don't instantiate object too early