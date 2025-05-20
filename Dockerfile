FROM openjdk:21-slim
EXPOSE 8080
ADD target/spring-jenkins-demo.jar spring-jenkins-demo.jar
ENTRYPOINT ["java", "-jar", "/spring-jenkins-demo.jar"]
