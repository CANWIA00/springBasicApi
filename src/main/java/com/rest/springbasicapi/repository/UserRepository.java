package com.rest.springbasicapi.repository;

import com.rest.springbasicapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
