
FROM openjdk:21-jdk-slim

LABEL authors="pavel"

WORKDIR /app

COPY target/what-shall-we-do.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]