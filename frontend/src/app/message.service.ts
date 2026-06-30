import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface MessageRequest {
    sessionId: string;
    content: string;
}

export interface MessageResponse {
    id: string;
    sender: string;
    content: string;
    timestamp: string;
}

@Injectable({
    providedIn: 'root'
})
export class MessageService {
    private apiUrl = 'http://localhost:8080/api/guide/messages';

    constructor(private http: HttpClient) {}

    sendMessage(content: string, sessionId: string): Observable<MessageResponse> {
        const body: MessageRequest = { sessionId, content };
        return this.http.post<MessageResponse>(this.apiUrl, body);
    }
}