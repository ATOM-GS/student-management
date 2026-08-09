#!/bin/bash

cd /opt/student-management

nohup java -jar student-management-0.0.1-SNAPSHOT.jar \
  > /var/log/student-management.log 2>&1 &