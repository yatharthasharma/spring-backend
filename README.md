# Spring Boot API

This project uses the following:

- Java 17 & Spring Boot
- Postgres with Flyway migrations
- Docker & Docker Compose
- (Optional) [Offset Explorer](https://kafkatool.com/download.html) as Kafka UI

Run using ```./mvnw spring-boot:run```

Execute flyway migrations using ```./mvnw flyway:migrate``` & check the latest information using ```./mvnw flyway:info```

## Helpful notes

- Used [this guide](https://www.baeldung.com/ops/kafka-docker-setup) to setup Kafka locally