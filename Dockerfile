FROM java:8

ADD target/spboot-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8081

ENTRYPOINT ["JAVA", "-jar", "/app.jar"]