#!/bin/bash

for i in root@hadoop1-host root@hadoop2-host root@hadoop3-host; do
  echo "===================$i======================"
  ssh $i 'zkServer.sh start'
done
