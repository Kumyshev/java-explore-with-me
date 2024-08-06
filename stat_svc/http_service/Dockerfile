FROM amazoncorretto:11-alpine-jdk
COPY target/*.jar stat_svc.jar
ENTRYPOINT ["java","-jar","/stat_svc.jar"]