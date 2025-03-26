# Workshop CRUD API - Spring Boot

## Overview
This is a simple CRUD REST API built with Spring Boot that manages a store system. It allows basic operations for users, products, orders, and categories. The project is intended for testing purposes only.

## Tech Stack
- **Java:** 24
- **Spring Boot:** 3.4.3
- **Database:** H2 (testing), PostgreSQL (production)
- **ORM:** Hibernate
- **Dependency Management:** Maven

## Features & Endpoints

| Resource  | Endpoint        | Description  |
|-----------|----------------|--------------|
| Users     | `/users`        | Manage users |
| Products  | `/products`     | Manage products |
| Orders    | `/orders`       | Manage orders |
| Categories| `/categories`   | Manage categories |

- **Pagination, filtering, and sorting:** Not implemented
- **Authentication & Roles:** No authentication or user roles

## Setup & Installation

### Prerequisites
- Java 24 installed
- Maven installed

### Steps to Run
1. Clone the repository:
   ```sh
   git clone https://github.com/juliostmendes/workshop-springboot3-jpa/
   cd workshop-springboot3-jpa
   ```
2. Run the application:
   ```sh
   ./mvnw spring-boot:run
   ```

### Configuration
The application uses `application.properties` for configuration:
- `application-dev.properties` (Development environment)
- `application-test.properties` (Testing environment)

*If running the Development environment make sure to config your Postgres data

## Future Improvements
- Implement authentication (JWT)
- Add pagination, filtering, and sorting
- Deploy using Docker or cloud services
