package com.devsuperior.movieflix.services;

import com.devsuperior.movieflix.dtos.UserDto;
import com.devsuperior.movieflix.entities.User;
import com.devsuperior.movieflix.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthService authService;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(name);

        if (user == null){
            throw new UsernameNotFoundException("UserName not found");
        }
        return user;
    }

    @Transactional(readOnly = true)
    public UserDto getProfile(){
        User user = authService.authenticated();
        return new UserDto(user);
    }
}
