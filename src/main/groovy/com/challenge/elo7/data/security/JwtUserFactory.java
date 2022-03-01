package com.challenge.elo7.data.security;

import com.challenge.elo7.domain.enums.ProfileEnum;
import com.challenge.elo7.domain.user.UserDataResponse;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.List;

public class JwtUserFactory {

    private JwtUserFactory() {
    }


    public static JwtUser create(UserDataResponse userDataDTO) {
        return new JwtUser(userDataDTO.getCode(), userDataDTO.getEmail(), userDataDTO.getPassword(),
                mapToGrantedAuthorities(userDataDTO.getProfile()));
    }


    private static List<GrantedAuthority> mapToGrantedAuthorities(ProfileEnum profile) {
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(profile.toString()));
        return authorities;
    }

}
