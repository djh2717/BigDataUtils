#!/bin/bash
#1 获取输入参数个数，如果没有参数，直接退出
for i in root@hadoop1-host root@hadoop2-host root@hadoop3-host root@hadoop4-host
do 
   echo "===================$i======================"
   ssh $i '/home/java/jdk1.8.0_171/bin/jps'
done