package com.challenge.elo7.domain.user;

import com.challenge.elo7.domain.enums.ProfileEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.catalina.User;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDataResponse {
    private Long code;
    private String email;
    private String password;
    private ProfileEnum profile;

    public UserDataResponse(UserData entity) {
        this.code = entity.getId();
        this.email = entity.getEmail();
        this.password = entity.getPassword();
        this.profile = entity.getProfile();
    }
}
