package com.usertask.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.usertask.api.UserEntity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String username);

    @Query("SELECT u FROM User WHERE u.email = ?1")
    public User findByEmail(String email);

}
