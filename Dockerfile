FROM openjdk:8
EXPOSE 8080
ADD /target/demoapp.jar demoapp.jar
CMD exec java -Dspring.profiles.active=dev -jar demoapp.jar