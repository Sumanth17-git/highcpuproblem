FROM openjdk:17-jdk-slim
WORKDIR /usr/app
ADD target/*.jar cpuspikes.jar
ENV JAVA_OPTS=""
EXPOSE 9092
ENTRYPOINT exec java ${JAVA_OPTS} -jar cpuspikes.jar
