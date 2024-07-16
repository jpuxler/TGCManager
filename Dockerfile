FROM openjdk:17-jdk-slim

LABEL maintainer="your-email@example.com"

VOLUME /tmp

EXPOSE 8080

ARG JAR_FILE=target/TCGManager-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} app.jar

ENTRYPOINT ["java", "-jar","/app.jar"]