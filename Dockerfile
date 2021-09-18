FROM openjdk:8-jdk-alpine
RUN adduser -D demo
USER demo
ADD target/myfarm-*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
