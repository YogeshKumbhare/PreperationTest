package org.example.controller;

import org.example.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    private final MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping("/send")
    public ResponseEntity<String> sendMessage(@RequestBody String message) {
        messageService.sendMessage(message);
        return ResponseEntity.ok("Message sent successfully");
    }

    @PostMapping("/send-and-receive")
    public ResponseEntity<String> sendAndReceive(@RequestBody String message) {
        String response = messageService.sendAndReceive(message);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("Service is running");
    }
}
