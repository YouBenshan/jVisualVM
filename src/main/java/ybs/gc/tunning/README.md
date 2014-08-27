gc
==
Goal:
1. Minor GC tunning -- Promotion Failure


Step:
java -XX:+UseParallelGC -Xmx4g -XX:+PrintGCDetails -XX:-UseAdaptiveSizePolicy ybs.gc.tunning.PromotionFailure

java -XX:+UseConcMarkSweepGC -Xmx4g -Xmn3g -XX:SurvivorRatio=8 -XX:+PrintGCDetails -XX:-UseAdaptiveSizePolicy ybs.gc.tunning.PromotionFailure