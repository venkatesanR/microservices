#!/bin/sh
echo "********************************************************"
echo "Starting Service Discovery server :  $CONFIGSERVER_URI"
echo "********************************************************"
java -jar /usr/local/eurekaserver/eurekaserver-1.0-SNAPSHOT.jar
