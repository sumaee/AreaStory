FROM openjdk:11-jdk
ARG JAR_FILE=build/libs/*.jar
#COPY ${JAR_FILE} ./app.jar
COPY ${JAR_FILE} areastory-user.jar
#EXPOSE 8099
ENTRYPOINT ["java", "-jar", "areastory-user.jar"]