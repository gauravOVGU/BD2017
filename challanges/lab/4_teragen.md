Teragen command:
time sudo -u neymar hadoop jar /opt/cloudera/parcels/CDH/lib/hadoop-mapreduce/hadoop-mapreduce-examples.jar teragen -Ddfs.blocksize=16M -Dmapred.map.tasks=8 655360 /user/neymar/tgen640

Teragen output:
[root@ip-172-31-4-134 var]# time sudo -u neymar hadoop jar /opt/c
loudera/parcels/CDH/lib/hadoop-mapreduce/hadoop-mapreduce-example
s.jar teragen -Ddfs.blocksize=16M -Dmapred.map.tasks=8 655360 /us
er/neymar/tgen640
17/07/06 12:21:49 INFO client.RMProxy: Connecting to ResourceMana
ger at ec2-35-158-126-61.eu-central-1.compute.amazonaws.com/172.3
1.4.134:8032
17/07/06 12:21:49 INFO terasort.TeraGen: Generating 655360 using 
8
17/07/06 12:21:49 INFO mapreduce.JobSubmitter: number of splits:8
17/07/06 12:21:49 INFO Configuration.deprecation: mapred.map.task
s is deprecated. Instead, use mapreduce.job.maps
17/07/06 12:21:50 INFO mapreduce.JobSubmitter: Submitting tokens 
for job: job_1499356755232_0001
17/07/06 12:21:50 INFO impl.YarnClientImpl: Submitted application
 application_1499356755232_0001
17/07/06 12:21:50 INFO mapreduce.Job: The url to track the job: h
ttp://ec2-35-158-126-61.eu-central-1.compute.amazonaws.com:8088/p
roxy/application_1499356755232_0001/
17/07/06 12:21:50 INFO mapreduce.Job: Running job: job_1499356755
232_0001
17/07/06 12:21:58 INFO mapreduce.Job: Job job_1499356755232_0001 
running in uber mode : false
17/07/06 12:21:58 INFO mapreduce.Job:  map 0% reduce 0%
17/07/06 12:22:06 INFO mapreduce.Job:  map 25% reduce 0%
17/07/06 12:22:09 INFO mapreduce.Job:  map 50% reduce 0%
17/07/06 12:22:10 INFO mapreduce.Job:  map 63% reduce 0%
17/07/06 12:34:28 INFO mapreduce.Job: Task Id : attempt_149935675
5232_0001_m_000005_0, Status : FAILED
AttemptID:attempt_1499356755232_0001_m_000005_0 Timed out after 6
00 secs
Container expired since it was unused
17/07/06 12:34:28 INFO mapreduce.Job: Task Id : attempt_149935675
5232_0001_m_000006_0, Status : FAILED
AttemptID:attempt_1499356755232_0001_m_000006_0 Timed out after 6
00 secs
Container expired since it was unused
17/07/06 12:34:28 INFO mapreduce.Job: Task Id : attempt_149935675
5232_0001_m_000007_0, Status : FAILED
AttemptID:attempt_1499356755232_0001_m_000007_0 Timed out after 6
00 secs
Container expired since it was unused
17/07/06 12:34:36 INFO mapreduce.Job:  map 100% reduce 0%
17/07/06 12:34:37 INFO mapreduce.Job: Job job_1499356755232_0001 
completed successfully
17/07/06 12:34:37 INFO mapreduce.Job: Counters: 34
        File System Counters
                FILE: Number of bytes read=0
                FILE: Number of bytes written=1022216
                FILE: Number of read operations=0
                FILE: Number of large read operations=0
                FILE: Number of write operations=0
                HDFS: Number of bytes read=677
                HDFS: Number of bytes written=65536000
                HDFS: Number of read operations=32
                HDFS: Number of large read operations=0
                HDFS: Number of write operations=16
        Job Counters 
                Failed map tasks=3
                Launched map tasks=11
                Other local map tasks=11
                Total time spent by all maps in occupied slots (m
s)=2300751
                Total time spent by all reduces in occupied slots
 (ms)=0
                Total time spent by all map tasks (ms)=2300751
                Total vcore-milliseconds taken by all map tasks=2
300751
                Total megabyte-milliseconds taken by all map task
s=2355969024
        Map-Reduce Framework
                Map input records=655360
                Map output records=655360
                Input split bytes=677
                Spilled Records=0
                Failed Shuffles=0
                Merged Map outputs=0
                GC time elapsed (ms)=565
                CPU time spent (ms)=20420
                Physical memory (bytes) snapshot=1630617600
                Virtual memory (bytes) snapshot=12504477696
                Total committed heap usage (bytes)=2312110080
                Peak Map Physical memory (bytes)=252133376
                Peak Map Virtual memory (bytes)=1575882752
        org.apache.hadoop.examples.terasort.TeraGen$Counters
                CHECKSUM=1408100361519672
        File Input Format Counters 
                Bytes Read=0
        File Output Format Counters 
                Bytes Written=65536000

real    12m51.064s
user    0m8.751s
sys     0m0.508s
The command and output of hdfs dfs -ls /user/neymar/tgen640:

[root@ip-172-31-4-134 var]# hdfs dfs -ls /user/neymar/tgen640
Found 9 items
-rw-r--r--   3 neymar merengues          0 2017-07-06 12:34 /user
/neymar/tgen640/_SUCCESS
-rw-r--r--   3 neymar merengues    8192000 2017-07-06 12:22 /user
/neymar/tgen640/part-m-00000
-rw-r--r--   3 neymar merengues    8192000 2017-07-06 12:22 /user
/neymar/tgen640/part-m-00001
-rw-r--r--   3 neymar merengues    8192000 2017-07-06 12:22 /user
/neymar/tgen640/part-m-00002
-rw-r--r--   3 neymar merengues    8192000 2017-07-06 12:22 /user
/neymar/tgen640/part-m-00003
-rw-r--r--   3 neymar merengues    8192000 2017-07-06 12:22 /user
/neymar/tgen640/part-m-00004
-rw-r--r--   3 neymar merengues    8192000 2017-07-06 12:34 /user
/neymar/tgen640/part-m-00005
-rw-r--r--   3 neymar merengues    8192000 2017-07-06 12:34 /user
/neymar/tgen640/part-m-00006
-rw-r--r--   3 neymar merengues    8192000 2017-07-06 12:34 /user
/neymar/tgen640/part-m-00007

The command and output to show how many blocks are stored under this directory:

[root@ip-172-31-4-134 var]# hdfs fsck /user/neymar/tgen640
Connecting to namenode via http://ec2-54-93-177-105.eu-central-1.
compute.amazonaws.co:50070
FSCK started by root (auth:SIMPLE) from /172.31.4.134 for path /u
ser/neymar/tgen640 at Thu Jul 06 12:42:00 EDT 2017
.........Status: HEALTHY
 Total size:    65536000 B
 Total dirs:    1
 Total files:   9
 Total symlinks:                0
 Total blocks (validated):      8 (avg. block size 8192000 B)
 Minimally replicated blocks:   8 (100.0 %)
 Over-replicated blocks:        0 (0.0 %)
 Under-replicated blocks:       0 (0.0 %)
 Mis-replicated blocks:         0 (0.0 %)
 Default replication factor:    3
 Average block replication:     3.0
 Corrupt blocks:                0
 Missing replicas:              0 (0.0 %)
 Number of data-nodes:          3
 Number of racks:               1
FSCK ended at Thu Jul 06 12:42:00 EDT 2017 in 3 milliseconds


The filesystem under path '/user/neymar/tgen640' is HEALTHY