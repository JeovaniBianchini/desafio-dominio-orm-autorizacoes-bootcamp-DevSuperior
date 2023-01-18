package com.devsuperior.movieflix.dtos;

import com.devsuperior.movieflix.entities.User;

import java.io.Serializable;

public class UserDto implements Serializable {

    private Long id;
    private String email;
    private String name;

    public UserDto(){
    }

    public UserDto(Long id, String email, String name) {
        this.id = id;
        this.email = email;
        this.name = name;
    }

    public UserDto(User user) {
        id = user.getId();
        email = user.getEmail();
        name = user.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
