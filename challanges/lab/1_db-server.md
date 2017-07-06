# The hostname of your db server node:

[ec2-user@ip-172-31-4-134 yum.repos.d]$ hostname
ip-172-31-4-134.eu-central-1.compute.internal

# The command and output for display your database server's version

#mysql-server

[ec2-user@ip-172-31-4-134 yum.repos.d]$ mysql --version
mysql  Ver 14.14 Distrib 5.6.36, for Linux (x86_64) using  EditLine wrapper

#mysql-client

[ec2-user@ip-172-31-12-241 ~]$ mysql --version
mysql  Ver 14.14 Distrib 5.6.36, for Linux (x86_64) using  EditLi
ne wrapper

# The command and output for listing your created databases

mysql> show databases;

+--------------------+
| Database           |
+--------------------+
| information_schema |
| hive               |
| hue                |
| mysql              |
| oozie              |
| performance_schema |
| rman               |
| scm                |
| sentry             |
+--------------------+
9 rows in set (0.00 sec)
