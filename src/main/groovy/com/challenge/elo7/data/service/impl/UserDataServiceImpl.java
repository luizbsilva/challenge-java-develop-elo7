package com.challenge.elo7.data.service.impl;

import com.challenge.elo7.data.repository.UserDataRepository;
import com.challenge.elo7.data.service.UserDataService;
import com.challenge.elo7.domain.user.UserDataResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDataServiceImpl implements UserDataService {

    @Autowired
    private UserDataRepository repository;

    @Override
    public Optional<UserDataResponse> findByEmail(String email) {
        return Optional.ofNullable(repository.findByEmail(email));
    }
}
