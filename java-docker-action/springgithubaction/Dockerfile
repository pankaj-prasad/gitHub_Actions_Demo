FROM openjdk:8-jdk-alpine as build
# Add dos2unix for line ending fixes
RUN apk add --no-cache dos2unix
WORKDIR /usr/app
# Copy source code
COPY . /usr/app

# Fix line endings if needed (especially if cloned on Windows)
RUN dos2unix mvnw

# Make mvnw executable and build app
RUN chmod +x mvnw && ./mvnw clean package

COPY . /usr/app
WORKDIR /usr/app

FROM openjdk:8-jre-alpine
COPY --from=build /usr/app/target/*.jar app.jar
EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]