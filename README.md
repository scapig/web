## web

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
docker tag web scapig/web:VERSION
docker login
docker push scapig/web:VERSION
``

## Running
``
docker run -p9050:9050 -d scapig/web
``
