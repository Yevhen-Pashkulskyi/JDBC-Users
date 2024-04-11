package org.example.app.entity;

public class User {

    private Long id;
    private String firstName;
    private String email;

    public User() {
    }

    public User(Long id, String firstName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void getName(String name) {
        this.firstName = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "id " + id +
                ", name: " + firstName +
                ", email: " + email + "\n";
    }
}
