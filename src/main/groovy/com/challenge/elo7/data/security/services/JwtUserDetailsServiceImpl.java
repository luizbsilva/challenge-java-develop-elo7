package com.challenge.elo7.data.security.services;

import com.challenge.elo7.data.security.JwtUserFactory;
import com.challenge.elo7.data.service.UserDataService;
import com.challenge.elo7.domain.user.UserData;
import com.challenge.elo7.domain.user.UserDataResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JwtUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserDataService userDataService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserDataResponse> userData = userDataService.findByEmail(username);

        if (userData.isPresent()) {
            return JwtUserFactory.create(userData.get());
        }

        throw new UsernameNotFoundException("Email não encontrado.");
    }

}
