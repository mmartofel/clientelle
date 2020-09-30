# FROM openjdk:8-jdk-alpine
# FROM ubi8/openjdk-8
FROM quay.io/repository/quarkus/ubi-quarkus-native-binary-s2i
VOLUME /tmp
ARG JAR_FILE
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080/tcp
