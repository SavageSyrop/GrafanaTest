FROM openjdk:21-rc-jdk-slim

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8099
ENTRYPOINT ["java", "-jar", "/app.jar"]
