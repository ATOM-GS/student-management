#!/bin/bash

if pgrep -f "student-management-0.0.1-SNAPSHOT.jar" > /dev/null
then
    pkill -f "student-management-0.0.1-SNAPSHOT.jar"
    sleep 5
fi