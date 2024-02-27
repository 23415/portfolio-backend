package com.example.portfolio_back.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Message {
    @Id
    private int msgid;

    private String name;
    private String email;
    private String msg;
}
