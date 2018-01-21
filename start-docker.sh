#!/bin/sh
SCRIPT=$(find . -type f -name web)
rm -f web*/RUNNING_PID
exec $SCRIPT -Dhttp.port=9050 -J-Xms128M -J-Xmx512m
