FROM openjdk:17-jdk-alpine
COPY target/*.jar main_svc.jar
ENTRYPOINT ["java","-jar","/main_svc.jar"]