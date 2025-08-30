
FROM openjdk:17-jdk-slim
COPY target/*.jar app.jar
# Expose port 8080 to the outside world
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]
