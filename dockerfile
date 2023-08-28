#BUILD
FROM maven:3.8.3 AS BUILD
COPY . .
RUN mvn clean package -DskispTests

#Stage Package
FROM openjdk:17-jdk-slim
COPY --from=BUILD /target/sala_f-0.0.1-SNAPSHOT.jar arquivo.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "arquivo.jar" ]    