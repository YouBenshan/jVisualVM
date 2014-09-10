High CPU Usage
==
Goal:
--
* Observe CUP usage
* Show the importance of IO buffer.


Step:
--
* Run:  
	`java -XX:+UseParallelGC -Xmx512m ybs.gc.cpu.HighCpu`
* Observer:  
	`CPU` in `Samples` Tab, `Self Time(CPU)`.
* Q:  
	* Find out which part of code is costly in jVisualVM.  
	* Improve the code.  


GOTO
--
###[Index Page](../../../../../../README.md)