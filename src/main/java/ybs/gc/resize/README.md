Container Resize
==
Goal:
--
* Observe resize of StringBuffer


Step:
--
* Run:  
`java -XX:+UseParallelGC -Xmx256m ybs.gc.resize.Main`

* Observe: 
	* Goto `Porfiler` Tab.
	* Click `Record allocations stack traces` in `Memory settings`
	* Take `Memory` `Snapshot`.
	* `Show Allocations stack traces` of the vast instances of a type (char[]).

* Improve:
	* Set StringBuffer's initial size in code.
	* Compare: Allocations of this type's instances?
	* Compare: Minor GC

* Q: 
	* Is there any other classes allocation can be improved in this way?  
	*ArrayList, HashSet, HashMap。。。*


GOTO
--
###[Threads](../thread/README.md)
###[Index Page](../../../../../../README.md)