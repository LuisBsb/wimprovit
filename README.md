# Wimprovit Project

This project calculates the Alticci sequence. The calculation uses recursion.
Before running the project, a redis must be created using docker compose.

## Download the image from redis
In the root of the project run the command below
```shell script
docker compose up -d
```
After the execution, check if REDIS is working by giving a PING, PONG must be returned

## Running the application in dev mode

To run the application:
```shell script
./mvnw compile quarkus:dev
```

## You can access the documentation(Swagger) at the address
> **_NOTE:_**  http://localhost:8080/q/wimprovit/