# DSList - Game Catalog API

A Spring Boot application that provides a REST API for managing video game catalogs and collections.

## Technologies

- Java 21
- Spring Boot 3.4.1
- Spring Data JPA
- PostgreSQL
- H2 Database (Test)
- Maven

## Features

- CRUD operations for games
- Game list management 
- List ordering functionality
- Database seeding for testing

## Setup

### Prerequisites
- Java 21+
- Maven

### Running locally

1. Clone the repository
```bash
git clone git@github.com:Pedro-Farrath/DSlist.git
```

2. Navigate to project directory
```bash
cd DSlist
```

3. Build with Maven
```bash
./mvnw clean install
```

4. Run the application
```bash
./mvnw spring-boot:run
```

The application will start on `http://localhost:8080`

### Database Configuration

- Development: H2 in-memory database
- Production: PostgreSQL (configure credentials in application.properties)

## Project Structure

```
src/main/java/com/farrathpedro/dslist/
├── controllers/     # REST endpoints
├── dto/            # Data Transfer Objects
├── entities/       # Domain models
├── projections/    # Database projections
├── repositories/   # Data access layer
└── services/       # Business logic
```

## License

This project is licensed under the Apache License 2.0
