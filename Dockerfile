FROM openjdk:8-jdk-alpine
WORKDIR /opt/app
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} vehicleapp.jar
ENTRYPOINT ["java","-jar","vehicleapp.jar"]
#ENTRYPOINT ["java","-cp","app:app/lib/*","app.jar"]
