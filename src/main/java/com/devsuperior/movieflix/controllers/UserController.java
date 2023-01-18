package com.devsuperior.movieflix.controllers;

import com.devsuperior.movieflix.dtos.UserDto;
import com.devsuperior.movieflix.entities.User;
import com.devsuperior.movieflix.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users/profile")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<UserDto> getProfile(){
        UserDto dto = userService.getProfile();
        return ResponseEntity.ok().body(dto);
    }
}
