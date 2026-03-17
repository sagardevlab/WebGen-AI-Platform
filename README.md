
# Webgenai

Spring Boot application for "Web Generation Using AI".

## Overview
- **What:** Java Spring Boot service with simple chat-related entities for building web-based AI interactions.
- **Key classes:** `WebgenaiApplication`, entities under `src/main/java/com/sagardevlab/webgenai/entity/` (e.g. `ChatMessage`, `ChatSession`, `MessageRole`).
- **Tech:** Spring Boot, Spring Data JPA, Lombok, H2 (dev), PostgreSQL (runtime).

## Requirements
- Java 21 (set in `pom.xml`).
- Maven (the project includes the Maven wrapper `./mvnw`).

## Quick start
Build and run with the wrapper:

```bash
# build
./mvnw -DskipTests package

# run (development)
./mvnw spring-boot:run

# or run packaged jar
java -jar target/*.jar
```

Run tests:

```bash
./mvnw test
```

## Configuration
Application settings are in [src/main/resources/application.properties](src/main/resources/application.properties).
By default the project includes H2 for quick development and a PostgreSQL runtime dependency for production.

## Lombok and generated code
This project uses Lombok (see `pom.xml`) to reduce boilerplate. One example you may see in the codebase is the use of `@FieldDefaults(level = AccessLevel.PRIVATE)` which sets a default visibility for fields so you don't have to add `private` to every field. To work smoothly in your IDE:

- Enable annotation processing (IDE setting).
- Install the Lombok plugin for your IDE (e.g., IntelliJ Lombok plugin).

Files of interest:
- Main application: [src/main/java/com/sagardevlab/webgenai/WebgenaiApplication.java](src/main/java/com/sagardevlab/webgenai/WebgenaiApplication.java)
- Entities: [src/main/java/com/sagardevlab/webgenai/entity/](src/main/java/com/sagardevlab/webgenai/entity/)
- App config: [src/main/resources/application.properties](src/main/resources/application.properties)

## Development notes
- Java version: 21 (see `pom.xml`).
- Lombok is optional at runtime and excluded from the final fat jar via plugin configuration.
- Database: change datasource settings in [src/main/resources/application.properties](src/main/resources/application.properties) to point to PostgreSQL for production.

## API (newly added controllers)
The project now includes REST controllers for authentication, project and file management, and project membership. Main endpoints:

- **Auth** (`/api/auth`)
	- `POST /api/auth/signup` — register a new user
	- `POST /api/auth/login` — authenticate and receive auth response
	- `GET /api/auth/me` — get current user profile

- **Projects** (`/api/projects`)
	- `GET /api/projects` — list projects (summary)
	- `GET /api/projects/{id}` — get project details
	- `POST /api/projects` — create a project
	- `PATCH /api/projects/{id}` — update a project
	- `DELETE /api/projects/{id}` — delete a project

- **Files** (`/api/projects/{projectId}/files`)
	- `GET /api/projects/{projectId}/files` — list file nodes for a project
	- `GET /api/projects/{projectId}/files/{*path}` — get file content by path

- **Project Members** (`/api/projects/{projectId}/members`)
	- `GET /api/projects/{projectId}/members` — list members of a project
	- `POST /api/projects/{projectId}/members` — invite/add a member
	- `PATCH /api/projects/{projectId}/members/{memberId}` — update a member's role
	- `DELETE /api/projects/{projectId}/members/{memberId}` — remove a member from a project

- **Billing / Plans / Subscriptions**
	- `GET /api/plans` — list available plans
	- `GET /api/me/subscription` — get current user's subscription
	- `POST /api/stripe/checkout` — create Stripe checkout session (returns session/url)
	- `POST /api/stripe/portal` — open Stripe customer portal

- **Usage** (`/api/usage`)
	- `GET /api/usage/today` — get today's usage for current user
	- `GET /api/usage/limits` — get current plan limits for current user

These controllers use DTOs located under `src/main/java/com/sagardevlab/webgenai/dto/` and services under `src/main/java/com/sagardevlab/webgenai/service/`.

## Contributing
- Fork and open a pull request. Keep changes small and focused.

## Where to look next
- Chat entities and domain objects: [src/main/java/com/sagardevlab/webgenai/entity/](src/main/java/com/sagardevlab/webgenai/entity/)
- Add or inspect controllers under `src/main/java/com/sagardevlab/webgenai/` if you need to expose APIs.
