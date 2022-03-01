package com.challenge.elo7.data.service

import com.challenge.elo7.domain.user.UserDataResponse


interface UserDataService {
    Optional<UserDataResponse> findByEmail(String email);

}