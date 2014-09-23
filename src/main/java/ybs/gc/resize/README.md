Container Resize
==
Goal:
--
* Observe resize of StringBuffer


Step:
--
* Run:  
	`java -XX:+UseParallelGC -Xmx256m ybs.gc.resize.Main false`

* Observe: 
	* In `Porfiler` Tab: click `Record allocations stack traces` in `Memory settings`, take `Memory` `Snapshot`,  `Show Allocations stack traces` of the vast instances of a type (char[]).  
	Most char[] are allocated by `java.util.Array.copyOf(char[],int)` method.  
	This shows the container(StringBuffer) is resizing.  
	The StringBuffer instance is big, large heap space is allocated and GC for this activity.

* Run:  
	`java -XX:+UseParallelGC -Xmx256m ybs.gc.resize.Main true`
	* Compare: Allocations of this type's instances?  
	In `Porfiler` Tab: Most char[] instances are allocated by `AbstractStringBuffer.<init>` method.
	* Compare: Minor GC  
	In `Visual GC` Tab: The activities of Minor GC is much less than before.

* Question: 
	* Is there any other classes allocation can be improved in this way?  
	*ArrayList, HashSet, HashMap。。。*


GOTO
--
###[Threads](../thread/README.md)
###[Index Page](../../../../../../README.md)