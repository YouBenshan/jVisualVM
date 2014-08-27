gc
==
Goal:
1. Observe CUP usage


Step:
java -XX:+UseParallelGC -Xmx2g ybs.gc.cpu.WrongFlush
Observer CPU Samples (Self Time -- CPU)