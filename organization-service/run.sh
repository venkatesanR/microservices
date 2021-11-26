#!/bin/sh

echo "********************************************************"
echo "Waiting for the configuration server to start on port $CONFIGSERVER_PORT"
echo "********************************************************"
while ! $(nc -z configserver $CONFIGSERVER_PORT); do sleep 3; done
echo "*******  Configuration Server has started"

echo "********************************************************"
echo "Starting License Server with Configuration Service :  $CONFIGSERVER_URI"
echo "********************************************************"
java -Dserver.port=$SERVER_PORT -Dspring.cloud.config.uri=$CONFIGSERVER_URI -Dspring.profiles.active=$PROFILE -jar /usr/local/orgservice/organization-service-1.0-SNAPSHOT.jar
