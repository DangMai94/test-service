FROM openjdk:17-jdk-slim as build
WORKDIR /app
COPY target/test-service.jar test-service.jar
ENTRYPOINT ["java", "-jar", "test-service.jar"]