# Roadmap

Full phase rationale lives in [`PROJECT_VISION.md`](PROJECT_VISION.md) §6. This file is the working, checkable version — update checkboxes as tasks land.

## Phase 0 — Foundations ✅ (this commit)
- [x] Repo structure (`backend/`, `frontend/`, `docs/`, `.github/`)
- [x] Backend skeleton: Spring Boot + health endpoint + test + security filter chain
- [x] Frontend skeleton: Angular + Guide Room shell calling the health endpoint
- [x] CI workflow (build + test, both projects)
- [x] Docker Compose skeleton
- [x] Architecture doc

## Phase 1 — MVP: The Guide Room (text-only)
- [ ] `Message` entity + repository (backend)
- [ ] `POST /api/guide/messages` endpoint (mock response first, no LLM call)
- [ ] Wire real LLM provider call behind `GuideService`
- [ ] Guide Room chat UI (message list + input) in Angular
- [ ] Basic conversation persistence (per anonymous session, no auth yet)

## Phase 2 — Now Point & Season Engine
- [ ] `Season` entity (title, start, end, status: active/archived)
- [ ] `NowPoint` entity (rolling short-term context)
- [ ] Logic to detect/propose a new Season from conversation (AI-assisted)
- [ ] Season Archive view (list of past Seasons, journal-style)

## Phase 3 — Board / Canvas
- [ ] `BoardObject` entity (type, payload, position)
- [ ] Auto-generation of board objects from conversation content
- [ ] Board UI (Angular) with basic CRUD
- [ ] User authentication (JWT) — needed once data is meaningfully personal

## Phase 4 — Guide Personas
- [ ] Persona data model (form/skin vs. personality kernel)
- [ ] Persona selection logic (server-driven / season-driven / user-driven — decide based on `PROJECT_VISION.md` §8 open question)

## Phase 5 — Activities Library
- [ ] Activity entity (type: body/mind/body-mind, duration)
- [ ] Seed data: first 10 activities
- [ ] Recommendation endpoint (filter by available time + Now Point)

## Phase 6 — Notifications & Affirmations
- [ ] Affirmation bank (generic, non-creepy — see `PROJECT_VISION.md` §2)
- [ ] Notification scheduling tied to Season/Now Point

## Phase 7 — Extensions
- [ ] Integration hook for Memory Lanes (or similar external activity module)

---

## Immediate task backlog (10–30 min, good for a collaborator with no context)

- [ ] Add `.editorconfig` for consistent formatting across IDEs
- [ ] Add a PR template (`.github/PULL_REQUEST_TEMPLATE.md`)
- [ ] Add Dependabot config for both `backend` (Maven) and `frontend` (npm)
- [ ] Write `glossary.md` (Guide / Season / Now Point / Lane / Board definitions, one paragraph each)
- [ ] First 10 activities as seed JSON (`docs/activities-seed.json`)
- [ ] Draft 20 generic affirmations (`docs/affirmations-bank.md`)
- [ ] Low-fi wireframes in `docs/wireframes/` (Excalidraw export is fine — Guide Room, Board, Season Archive, onboarding)
