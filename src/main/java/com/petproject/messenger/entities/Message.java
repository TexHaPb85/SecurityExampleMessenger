package com.petproject.messenger.entities;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name ="messages")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String message;
    private TypeOfMessage typeOfMessage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
