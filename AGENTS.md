# AGENTS.md - Lane Application Context

This file serves as context for any AI coding assistants or developers working on this repository.

## Architecture
- **Backend:** Spring Boot (Java 21, Maven). Code lives in `/backend`.
- **Frontend:** Node.js/NPM ecosystem. Code lives in `/frontend`.
- **Infrastructure:** Local development uses Docker Compose (`docker-compose.yml` in root).

## Conventions
- **Git Flow:** Feature branches format `feature/name-of-feature`. Commits follow Conventional Commits (e.g., `feat:`, `fix:`, `chore:`).
- **Testing:** Backend uses `mvn test`. Frontend uses `npm run test -- --watch=false --browsers=ChromeHeadless`. Tests must pass before opening a Pull Request.
- **Java Standards:** One public class per file. Explicit imports only.
