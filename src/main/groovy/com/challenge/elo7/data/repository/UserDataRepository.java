package com.challenge.elo7.data.repository;

import com.challenge.elo7.domain.user.UserData;
import com.challenge.elo7.domain.user.UserDataResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDataRepository extends JpaRepository<UserData, Long>, JpaSpecificationExecutor<UserData> {
    UserDataResponse findByEmail(String email);
}

