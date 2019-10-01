package com.petproject.messenger.controllers;



import com.petproject.messenger.entities.Message;
import com.petproject.messenger.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping
    public List<Message> getAllMessages(){
        return messageService.findAllMessages();
    }

    @PostMapping
    public Message createMessage(@RequestBody Message message){
        return messageService.addNewMessage(message);
    }

    @DeleteMapping("/{id}")
    public void deleteMessage(@RequestBody Message message, @PathVariable("id") Long id){
        messageService.deleteMessage(message);
    }

    @PutMapping("/{id}")
    public Message editMessageById(@RequestBody Message message, @PathVariable("id") Long id){
        return messageService.editMessageById(message,id);
    }
}
