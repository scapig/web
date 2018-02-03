#!/bin/sh
SCRIPT=$(find . -type f -name web)
rm -f web*/RUNNING_PID
exec $SCRIPT -Dhttp.port=9050 $JAVA_OPTS -J-Xms16M -J-Xmx64m
