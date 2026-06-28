import { Routes } from '@angular/router';
import { GuideRoomComponent } from './guide-room/guide-room.component';

// Phase 1 scope: a single route for the Guide Room.
// Board / Season-archive / onboarding routes are added in later phases
// (see docs/ARCHITECTURE.md and docs/PROJECT_VISION.md for the roadmap).
export const routes: Routes = [
  { path: '', component: GuideRoomComponent },
];
