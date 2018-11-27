FROM openjdk:8-slim
ADD target/gs-maven-0.1.0.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
