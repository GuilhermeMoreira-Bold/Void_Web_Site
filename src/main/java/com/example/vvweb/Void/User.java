package com.example.vvweb.Void;

import jakarta.persistence.*;

@Table(name = "users")
@Entity(name = "users")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String email;
}
