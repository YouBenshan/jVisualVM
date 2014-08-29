Resize Container
==
Goal:
1. Observe resize of StringBuffer


Step:
Run:
java -XX:+UseParallelGC -Xmx256m ybs.gc.resize.Main

Observe: 
	goto "Porfiler" Tab.
	click "Record allocations stack traces" in "Memory settings"
	take "Memory" "Snapshot".
	"Show Allocations stack traces" of the vast instances of a type (char[]). Find out where are they from.

Improve:
	Set StringBuffer's initial size in code.
	Compare: Where the instance of this type come from?
	Compare: Minor GC

	
Q:
Any other classes allocation can be improved in this way?
