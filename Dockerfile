FROM openjdk:8-jdk-alpine
EXPOSE 8085
ADD target/SampleDocker.jar SampleDocker.jar
ENTRYPOINT ["java","-jar","/SampleDocker.jar"]