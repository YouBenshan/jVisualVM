gc
==
Goal:
1. Observe CUP usage


Step:
java -XX:+UseParallelGC -Xmx512m ybs.gc.cpu.HighCpu
Observer CPU Samples (Self Time -- CPU)