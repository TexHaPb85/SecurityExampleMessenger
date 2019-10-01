package com.petproject.messenger.services;

import com.petproject.messenger.entities.Message;
import com.petproject.messenger.exceptions.MessageNotFoundException;
import com.petproject.messenger.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public List<Message> findAllMessages(){
        return messageRepository.findAll();
    }

    public Message addNewMessage(Message message){
        return messageRepository.save(message);
    }

    public Message editMessageById(Message message, Long messageId){
        Message thisMessage = messageRepository.findById(messageId)
                .orElseThrow(()-> new MessageNotFoundException(messageId));
        message.setId(thisMessage.getId());
        return messageRepository.save(message);
    }

    public void deleteMessage(Message message){
        messageRepository.delete(message);
    }
}
