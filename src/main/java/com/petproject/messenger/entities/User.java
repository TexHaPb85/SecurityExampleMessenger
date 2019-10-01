package com.petproject.messenger.entities;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Long id;
    private String login;
    private String password;
    private Long phoneNumber;
    private String photo;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
