# Lane

> AI-driven companion for mindful self-organization — see [`docs/PROJECT_VISION.md`](docs/PROJECT_VISION.md) for the full concept.

Lane is not a therapist replacement and not a generic chatbot. It organizes a person's life into **Seasons** (chapters with a beginning and an end), keeps a live **Now Point** (dynamic short-term context), and reflects rather than prescribes — through a **Guide** entity with a stable personality core and a changeable form.

## Status

🚧 Phase 0/1 — project skeleton. No real domain logic yet. See [`docs/ROADMAP.md`](docs/ROADMAP.md).

## Repository structure

```
lane-app/
├── backend/        Spring Boot API (Java 21, PostgreSQL, JPA, Spring Security)
├── frontend/       Angular app (TypeScript, standalone components)
├── docs/           Vision, architecture, roadmap, wireframes
└── .github/        CI workflows
```

## Running locally

### Backend
```bash
cd backend
mvn spring-boot:run
```
Requires a local PostgreSQL instance, or override with env vars:
```bash
DB_URL=jdbc:postgresql://localhost:5432/lane DB_USERNAME=lane DB_PASSWORD=lane mvn spring-boot:run
```
Health check: `GET http://localhost:8080/api/health`
API docs: `http://localhost:8080/swagger-ui.html`

### Frontend
```bash
cd frontend
npm install
npm start
```
Runs on `http://localhost:4200`.

### Full stack (Docker)
```bash
docker compose up --build
```

## Docs

- [`docs/PROJECT_VISION.md`](docs/PROJECT_VISION.md) — concept, domain entities, philosophy
- [`docs/ARCHITECTURE.md`](docs/ARCHITECTURE.md) — system architecture, data flow
- [`docs/ROADMAP.md`](docs/ROADMAP.md) — phased plan + task backlog
- [`CONTRIBUTING.md`](CONTRIBUTING.md) — branch/PR conventions for collaborators

## License

MIT — see [`LICENSE`](LICENSE).
