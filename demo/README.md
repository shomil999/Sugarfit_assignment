# Java Service Starter Template

This project is a minimal Spring Boot service template designed to serve as a base for future backend services.

The goal of this assignment was not to build complex business logic, but to structure the service the way I would approach a production-ready microservice — with clear layering, validation, centralized error handling, and basic operational readiness.

---

## Tech Stack

- Java 17
- Spring Boot 3
- Maven
- Spring Boot Actuator

---

## How to Run

### Prerequisites

- Java 17 installed
- Maven installed

Verify your setup:

```
java -version
mvn -v
```

Both should point to Java 17.

---

### Build
Go inside demo folder (Important)
```
mvn clean install
```

---

### Run

```
mvn spring-boot:run
```

The application starts on:

```
http://localhost:8080
```

---

## Available Endpoints

### 1. Health Check

```
GET /actuator/health
```

Used for readiness/liveness checks in production environments.

Example response:

```json
{
  "status": "UP"
}
```

---

### 2. Example Endpoint

```
POST /example
```

Request body:

```json
{
  "userId": "123",
  "value": 42
}
```

Successful response:

```json
{
  "status": "SUCCESS",
  "requestId": "generated-uuid"
}
```

Each request is assigned a correlation ID (`X-Request-Id`) for traceability.  
If the client does not send one, the service generates it automatically.

---

## Project Structure

The project follows a simple layered architecture:

- `controller` – REST API layer
- `service` – business logic layer
- `dto` – request and response models
- `config` – filters and configuration components
- `exception` – centralized exception handling
- `util` – shared utilities (e.g., request ID holder)

All components are organized under a single base package to ensure clean Spring component scanning.

---

## Design Decisions

- **Layered separation of concerns** to keep the codebase maintainable.
- **DTO-based API contracts** to decouple external APIs from internal models.
- **Global exception handler** to provide consistent error responses.
- **Request correlation ID filter** for better observability and easier debugging in distributed systems.
- **Actuator enabled** to support operational monitoring.
- **Validation at the API boundary** to fail fast on bad input.

The template intentionally keeps the business logic simple while focusing on engineering quality and production readiness.

---

## Assumptions

- No persistence layer was required for this assignment.
- No authentication or authorization layer was added to keep scope focused.
- Logging is basic but structured in a way that can be extended easily.

---

## Future Improvements

If this template were to evolve into a long-term production standard, I would add:

- OpenAPI / Swagger documentation
- Structured JSON logging
- Metrics via Micrometer + Prometheus
- Integration test setup (Testcontainers)
- Dockerfile and CI pipeline configuration
- Basic security layer (e.g., JWT-based authentication)
- Rate limiting and resilience patterns

---

## Closing Note

This template is intentionally minimal but structured to scale.  
The focus was on clarity, maintainability, and operational awareness rather than feature depth.
