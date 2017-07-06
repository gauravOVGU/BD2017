List of folders under hdfs:

[root@ip-172-31-4-134 var]# hdfs dfs -ls /user
Found 6 items
drwxrwxrwx   - mapred hadoop              0 2017-07-06 11:40 /use
r/history
drwxrwxr-t   - hive   hive                0 2017-07-06 11:41 /use
r/hive
drwxrwxr-x   - hue    hue                 0 2017-07-06 11:42 /use
r/hue
drwxr-xr-x   - hdfs   supergroup          0 2017-07-06 11:53 /use
r/neymar
drwxrwxr-x   - oozie  oozie               0 2017-07-06 11:42 /use
r/oozie
drwxr-xr-x   - hdfs   supergroup          0 2017-07-06 11:53 /use
r/ronaldo

The output from the CM API call ../api/v14/hosts:

[root@ip-172-31-4-134 var]# curl -u admin:admin 'http://ec2-35-15
8-126-61.eu-central-1.compute.amazonaws.com:7180/api/v14/hosts'
{
  "items" : [ {
    "hostId" : "4c7a273f-645f-4f3a-bb6a-8d48bc248217",
    "ipAddress" : "172.31.4.134",
    "hostname" : "ec2-35-158-126-61.eu-central-1.compute.amazonaw
s.com",
    "rackId" : "/default",
    "hostUrl" : "http://ec2-35-158-126-61.eu-central-1.compute.am
azonaws.com:7180/cmf/hostRedirect/4c7a273f-645f-4f3a-bb6a-8d48bc2
48217",
    "maintenanceMode" : false,
    "maintenanceOwners" : [ ],
    "commissionState" : "COMMISSIONED",
    "numCores" : 4,
    "numPhysicalCores" : 2,
    "totalPhysMemBytes" : 15664758784
  }, {
    "hostId" : "861dce0f-28a0-4047-91f6-f08ee5bd320d",
    "ipAddress" : "172.31.12.241",
    "hostname" : "ec2-54-93-177-105.eu-central-1.compute.amazonaw
s.co",
    "rackId" : "/default",
    "hostUrl" : "http://ec2-35-158-126-61.eu-central-1.compute.am
azonaws.com:7180/cmf/hostRedirect/861dce0f-28a0-4047-91f6-f08ee5b
d320d",
    "maintenanceMode" : false,
    "maintenanceOwners" : [ ],
    "commissionState" : "COMMISSIONED",
    "numCores" : 4,
    "numPhysicalCores" : 2,
    "totalPhysMemBytes" : 15664758784
  }, {
    "hostId" : "40a81de6-c662-4366-9ade-5a9b066f22f6",
    "ipAddress" : "172.31.4.27",
    "hostname" : "ec2-54-93-180-189.eu-central-1.compute.amazonaw
s.com",
    "rackId" : "/default",
    "hostUrl" : "http://ec2-35-158-126-61.eu-central-1.compute.am
azonaws.com:7180/cmf/hostRedirect/40a81de6-c662-4366-9ade-5a9b066
f22f6",
    "maintenanceMode" : false,
    "maintenanceOwners" : [ ],
    "commissionState" : "COMMISSIONED",
    "numCores" : 4,
    "numPhysicalCores" : 2,
    "totalPhysMemBytes" : 15664758784
  }, {
    "hostId" : "98d16ed6-a39e-4462-94c0-1e1326bcadc5",
    "ipAddress" : "172.31.12.60",
    "hostname" : "ec2-54-93-190-161.eu-central-1.compute.amazonaw
s.com",
    "rackId" : "/default",
    "hostUrl" : "http://ec2-35-158-126-61.eu-central-1.compute.am
azonaws.com:7180/cmf/hostRedirect/98d16ed6-a39e-4462-94c0-1e1326b
cadc5",
    "maintenanceMode" : false,
    "maintenanceOwners" : [ ],
    "commissionState" : "COMMISSIONED",
    "numCores" : 4,
    "numPhysicalCores" : 2,
    "totalPhysMemBytes" : 15664758784
  }, {
    "hostId" : "06dc1e44-394c-4432-90bf-e87cf641dd3f",
    "ipAddress" : "172.31.12.74",
    "hostname" : "ec2-54-93-241-124.eu-central-1.compute.amazonaw
s.com",
    "rackId" : "/default",
    "hostUrl" : "http://ec2-35-158-126-61.eu-central-1.compute.am
azonaws.com:7180/cmf/hostRedirect/06dc1e44-394c-4432-90bf-e87cf64
1dd3f",
    "maintenanceMode" : false,
    "maintenanceOwners" : [ ],
    "commissionState" : "COMMISSIONED",
    "numCores" : 4,
    "numPhysicalCores" : 2,
    "totalPhysMemBytes" : 15664758784
  } ]
}[root@ip-172-31-4-134 var]# 