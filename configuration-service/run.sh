#!/bin/sh

echo "********************************************************"
echo "Waiting for the eureka server to start on port $EUREKASERVER_PORT"
echo "********************************************************"
while ! $(nc -z eurekaserver $EUREKASERVER_PORT); do sleep 3; done
echo "******* Eureka Server has started"

echo "********************************************************"
echo "Starting License Server with Configuration Service :  $CONFIGSERVER_URI"
echo "********************************************************"
java -Dserver.port=$CONFIGSERVER_PORT -Deureka.client.serviceUrl.defaultZone=$EUREKASERVER_URI -jar /usr/local/configservice/configuration-service-1.0-SNAPSHOT.jar
