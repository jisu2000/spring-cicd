FROM openjdk:17-jdk-slim

ARG JAR_FILE=target/app.jar

EXPOSE 8080

WORKDIR /opt/app

COPY ${JAR_FILE} app.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","app.jar"]