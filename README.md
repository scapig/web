## web

This is the documentation of the API Manager Scapig: http://www.scapig.com.

## Building
``
sbt clean test
``

## Packaging
``
sbt universal:package-zip-tarball
docker build -t web .
``

## Publishing
``
docker tag web scapig/web
docker login
docker push scapig/web
``

## Running
``
docker run -p9050:9050 -d scapig/web
``
