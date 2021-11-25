FROM openjdk:8-jdk-alpine
MAINTAINER 'm.antonellavargas@gmail.com ,ypiredda31@gmail.com, germansanz93@gmail.com'
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} customer-service.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "/customer-service.jar"]
