# Contributing

This project is organized so a collaborator can pick up a small, self-contained task without needing the full context of the vision doc.

## Picking a task

Open [`docs/ROADMAP.md`](docs/ROADMAP.md) and grab any unchecked item under the current phase, or one from "Immediate task backlog" — those are designed to take 10–30 minutes and require no prior context.

## Branch naming

```
feature/<short-description>     e.g. feature/guide-room-mvp
fix/<short-description>
docs/<short-description>
```

## Commit messages

Conventional, short, imperative:
```
feat: add Season entity and repository
fix: correct health endpoint response shape
docs: add affirmations bank seed
```

## Pull requests

- One task per PR where possible.
- Fill in the PR template (auto-applied).
- CI must pass before merge (build + tests for whichever project you touched).
- Check off the corresponding box in `docs/ROADMAP.md` as part of the PR.

## Local setup

See the "Running locally" section in [`README.md`](README.md).

## Code style

- **Backend**: standard Java conventions, package-by-feature (see `backend/src/main/java/com/lane/app/health` as the reference structure for new features).
- **Frontend**: standalone Angular components, one feature folder per route/screen (see `frontend/src/app/guide-room` as the reference).
