package com.example.demo.dto;

public class UserRequest {

    private String username;
    private String email;
    private String password;
    private int role_id;

    // Constructors
    public UserRequest() {}

    public UserRequest(String username, String email, String password, int role_id) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.role_id = role_id;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getRole_id() {
        return role_id;
    }

    // Setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }
}
