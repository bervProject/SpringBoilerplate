FROM openjdk:17-alpine as build
COPY . .
CMD ./gradlew build

FROM openjdk:17-alpine as runtime
WORKDIR /app
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
COPY --from=build build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
