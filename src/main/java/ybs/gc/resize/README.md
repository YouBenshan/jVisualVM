Container Resize
==
Goal:
--
	1. Observe resize of StringBuffer


Step:
--
	Run: 
		java -XX:+UseParallelGC -Xmx256m ybs.gc.resize.Main

	Observe: 
		goto "Porfiler" Tab.
		click "Record allocations stack traces" in "Memory settings"
		take "Memory" "Snapshot".
		"Show Allocations stack traces" of the vast instances of a type (char[]).

	Improve:
		Set StringBuffer's initial size in code.
		Compare: Allocations of this type's instances?
		Compare: Minor GC

	
	Q: 
		Is there any other classes allocation can be improved in this way?
		ArrayList, HashSet, HashMap。。。

GOTO
--
###[Threads](../thread/README.md)
###[Index Page](../../../../../../README.md)