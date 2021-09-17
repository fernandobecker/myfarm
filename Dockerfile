FROM openjdk:8-jdk-alpine
EXPOSE 8080
ARG JAR_FILE=target/myfarm-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} mybank.jar
ENTRYPOINT ["java","-jar","/mybank.jar"]
