#!/bin/sh

mvn install
docker build -t spring-docker .
docker run -e "SPRING_PROFILES_ACTIVE=qa" -p 8080:8080 --name spring-docker spring-docker

