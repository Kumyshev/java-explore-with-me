FROM openjdk:17-jdk-alpine
COPY target/*.jar stat_svc.jar
ENTRYPOINT ["java","-jar","/stat_svc.jar"]