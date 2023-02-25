FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/account*.jar /account-service.jar
CMD ["java", "-jar", "/account-service.jar", "--spring.profiles.active=dev"]
EXPOSE 8080
