FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn -q package -DskipTests

FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=build /app/target/damilon5-1.0-SNAPSHOT.jar /app/damilon5.jar
ENV PORT=8080
EXPOSE 8080
CMD ["java", "-jar", "/app/damilon5.jar"]
