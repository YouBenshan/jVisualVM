Minor & Full GC
==
Goal:
1. Observe Minor GC
2. Feel Stop-The-World of Full GC


Step:
java -XX:+UseParallelGC -Xms512m -Xmx512m ybs.gc.minorAndFull.Main

Read explanation of these parameters
-XX:+UseG1GC
-XX:+UseSerialGC
-XX:+UseConcMarkSweepGC
-XX:+UseParallelGC
-XX:+UseParallelOldGC
-XX:+UseParNewGC
-Xms
-Xmx

Minor GC

Full GC
	Stop-The-World: See the Stdout , normally the output value is <1050, but sometime is 1100~1300(around Full GC)
	How about: java -XX:+UseParallelGC -Xms2G -Xmx2G ybs.gc.minorAndFull.Main (make sleep shorter)
SoftReference
	Read the java doc
	Compare with other type of References

Explain Tab:
	Monitor
	Visual GC


Conclusion:
Full GC is Much expensive than Minor GC
Don't instantiate object too early