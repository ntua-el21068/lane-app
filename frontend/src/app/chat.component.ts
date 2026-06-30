import {Component, Injectable} from '@angular/core';
import { MessageService, MessageResponse } from './message.service';

@Injectable()
@Component({
    selector: 'app-chat',
    templateUrl: './chat.component.html',
    styleUrls: ['./chat.component.css']
})
export class ChatComponent {
    userInput: string = '';
    messages: MessageResponse[] = [];
    currentSessionId: string = 'session-123'; // Temporary hardcoded session

    constructor(private messageService: MessageService) {}

    onSendMessage() {
        if (!this.userInput.trim()) return;

        // 1. Push user message to UI immediately
        this.messages.push({
            id: 'temp-id',
            sender: 'USER',
            content: this.userInput,
            timestamp: new Date().toISOString()
        });

        const typedMessage = this.userInput;
        this.userInput = ''; // Clear input field

        // 2. Send to Spring Boot backend
        this.messageService.sendMessage(typedMessage, this.currentSessionId).subscribe({
            next: (response) => {
                // 3. Push the mock AI reply to the chat array
                this.messages.push(response);
            },
            error: (err) => {
                console.error('Failed to send message:', err);
            }
        });
    }
}