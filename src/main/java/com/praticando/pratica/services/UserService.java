package com.praticando.pratica.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.praticando.pratica.entities.User;
import com.praticando.pratica.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	// returns all database users
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
