# Notes API

Simple RESTful API for managing personal notes. Built with **Spring Boot 3** and **Java 17**.

## Features
- Create, read, update, delete notes
- In‑memory **H2** database (dev) / **PostgreSQL** profile (prod)
- OpenAPI / Swagger UI for interactive docs
- Dockerfile for containerised run
- Placeholder CI workflow (GitHub Actions)

## Getting Started
### Prerequisites
* JDK 17+
* Maven 3.9+ (or use the provided `mvnw` wrapper)

### Run locally
```bash
./mvnw spring-boot:run
```
The app will start at **http://localhost:8080**.

Swagger UI: **http://localhost:8080/swagger-ui.html**

### Docker
```bash
docker build -t notes-api .
docker run -p 8080:8080 notes-api
```

### Endpoints

| Method | Path | Description         |
|--------|------|---------------------|
| GET    | /api/notes            | Get all notes      |
| GET    | /api/notes/{id}       | Get a note by id   |
| POST   | /api/notes            | Create a new note  |
| PUT    | /api/notes/{id}       | Update a note      |
| DELETE | /api/notes/{id}       | Delete a note      |

## Roadmap
See **TODO.md**

---

_Generated 2025-07-06_
