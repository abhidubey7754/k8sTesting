FROM openjdk:17
MAINTAINER abhi abhi@gmail.com
WORKDIR /apps/test
COPY target/k8sTesting.jar  k8sTesting.jar
ENTRYPOINT ["java","-jar","k8sTesting.jar"]