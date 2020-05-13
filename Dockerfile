FROM openjdk:8-jdk-alpine
ADD target/docker-db-status.jar  docker-db-status.jar  
EXPOSE 8080
ENTRYPOINT ["java","-jar","docker-db-status.jar"]