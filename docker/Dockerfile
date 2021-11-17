FROM openjdk:8-jdk-alpine
COPY target/*.jar app.jar
COPY entrypoint.sh /
ENTRYPOINT ["java", "-jar","/app.jar"]