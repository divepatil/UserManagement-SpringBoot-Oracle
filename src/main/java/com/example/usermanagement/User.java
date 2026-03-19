package com.example.usermanagement;

import jakarta.persistence.*;

@Entity
@Table(name = "USERS") // This tells Oracle to create a table called "USERS"
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String email;
    private String password;

    // --- GETTERS AND SETTERS (The logic for Java to read/write data) ---
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
