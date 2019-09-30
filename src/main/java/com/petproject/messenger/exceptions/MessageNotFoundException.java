package com.petproject.messenger.exceptions;

public class MessageNotFoundException extends RuntimeException {
    public MessageNotFoundException(Long messageId) {
        super("Message with id:" + messageId + "was not found");
    }
}
