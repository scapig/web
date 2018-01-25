#!/bin/sh
sbt universal:package-zip-tarball
docker build -t web .
docker tag web scapig/web
docker push scapig/web
