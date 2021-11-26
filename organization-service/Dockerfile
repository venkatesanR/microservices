FROM openjdk:8-jdk-alpine
RUN  apk update && apk upgrade && apk add netcat-openbsd
RUN mkdir -p /usr/local/orgservice
COPY target/organization-service-1.0-SNAPSHOT.jar /usr/local/orgservice/
ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh