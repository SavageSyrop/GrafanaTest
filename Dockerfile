FROM openjdk:21-rc-jdk-slim

COPY grafana_demo.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
