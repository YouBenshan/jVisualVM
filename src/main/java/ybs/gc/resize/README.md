Resize Container
==
Goal:
1. Observe resize of StringBuffer

Step:

java -XX:+UseParallelGC -Xmx256m ybs.gc.resize.Main
Find vast instances of a type (char[]). Find out where are they from.

Set StringBuffer's initial size.
Compare: the source of this type.
Compare: Minor GC 

