#!/bin/sh
set -e

cd spboot
mvn package
#cp spboot/target/spboot-0.0.1-SNAPSHOT.jar build-output/app.jar
#ls build-output
