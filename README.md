# Spring base application

Simple REST api written in Java using Spring framework.
Connects to PostgreSQL db for data persistence.

## Run the stack

```sh
cp .env.sample .env
docker compose up
```

## Build Docker image

```sh
./mvnw spring-boot:build-image "-Dspring-boot.build-image.imageName=spring-base" -DskipTests
```

## Publish in Docker Hub repository

```sh
docker login -u <username>
docker tag spring-base westfox5/repository:spring-base
docker push westfox5/repository:spring-base
```
