FROM openjdk:21-jre-slim
EXPOSE 8080
ADD target/spring-jenkins-demo.jar spring-jenkins-demo.jar
ENTRYPOINT ["java", "-jar", "/spring-jenkins-demo.jar"]
