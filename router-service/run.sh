#!/bin/sh

echo "********************************************************"
echo "Waiting for the configuration server to start on port $CONFIGSERVER_PORT"
echo "********************************************************"
while ! $(nc -z configserver $CONFIGSERVER_PORT); do sleep 3; done
echo "*******  Configuration Server has started"

echo "********************************************************"
echo "Starting Router service "
echo "********************************************************"
java -Dspring.cloud.config.uri=$CONFIGSERVER_URI -Deureka.client.serviceUrl.defaultZone=$EUREKASERVER_URI   -jar /usr/local/routeservice/router-service-1.0-SNAPSHOT.jar
