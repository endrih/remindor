#!/bin/bash
set -e
pushd ./client
ng build
popd

pushd ./server
./mvnw clean package
docker build . -t remindor:latest