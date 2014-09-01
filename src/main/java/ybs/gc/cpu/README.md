CPU
==
Goal:
1. Observe CUP usage
2. Show the importance of IO buffer.

Step:
Run: java -XX:+UseParallelGC -Xmx512m ybs.gc.cpu.HighCpu
Observer: 
	"CPU" in "Samples" Tab, "Self Time(CPU)".
	Q: Find out which part of code is costly in jVisualVM.
	Q: Improve the code.