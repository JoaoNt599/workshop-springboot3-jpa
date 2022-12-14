package com.praticando.pratica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praticando.pratica.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
