FROM openjdk:17-oracle
EXPOSE 9090
ADD build/libs/dockerintegration-0.0.1-SNAPSHOT.jar dockerintegration.jar
ENTRYPOINT [ "java", "-jar", "/dockerintegration.jar" ]