import { Component, OnInit, signal } from '@angular/core';
import { HttpClient } from '@angular/common/http';

/**
 * Phase 1 scope: minimal Guide Room screen.
 * Confirms the frontend can reach the backend health endpoint -
 * the frontend equivalent of HealthController on the backend.
 * Real chat UI / Guide personality rendering arrives in later phases.
 */
@Component({
  selector: 'app-guide-room',
  standalone: true,
  template: `
    <main>
      <h1>Guide Room</h1>
      <p>Backend status: {{ backendStatus() }}</p>
    </main>
  `,
})
export class GuideRoomComponent implements OnInit {
  backendStatus = signal<string>('checking...');

  constructor(private http: HttpClient) {}

  ngOnInit(): void {
    this.http.get<{ status: string }>('/api/health').subscribe({
      next: (res) => this.backendStatus.set(res.status),
      error: () => this.backendStatus.set('unreachable'),
    });
  }
}
