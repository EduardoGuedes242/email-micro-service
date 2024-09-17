FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY target/email-0.0.1-SNAPSHOT.jar /app/aplicacao.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "/app/aplicacao.jar"]