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
* Question:  
	* Find out which part of code is costly in jVisualVM.  
	*Take a Snapshot of `CPU sample`. Pay attention to the `BufferedWriter.flush()` in CallTree.*
	* Improve the code.  
	*See in the code.  
	Read more about the relationship of CPU System Usage and Java IO in book "Java Performance".*


GOTO
--
###[Index Page](../../../../../../README.md)