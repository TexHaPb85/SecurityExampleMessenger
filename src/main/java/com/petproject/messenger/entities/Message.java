package com.petproject.messenger.entities;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name ="messages")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="message_id")
    private Long id;
    private String message;
    private TypeOfMessage typeOfMessage;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_id")
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
