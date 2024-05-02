package edu.iu.habahram.databsedemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(schema = "flowers", name="customers")
public final class Customer {
    @Id
    @GeneratedValue
    private Integer id;
    private  String username;
    private  String password;
    private  String email;

    public Customer() {
    }

    public Customer(String username,
                    String password,
                    String email,
                    Integer id) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.id =id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId(){return id;}

    public void setId(int id) { this.id=id;}
}
