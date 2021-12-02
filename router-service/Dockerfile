FROM openjdk:8-jdk-alpine
RUN  apk update && apk upgrade && apk add netcat-openbsd
RUN mkdir -p /usr/local/routeservice
COPY target/router-service-1.0-SNAPSHOT.jar /usr/local/routeservice/
ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh