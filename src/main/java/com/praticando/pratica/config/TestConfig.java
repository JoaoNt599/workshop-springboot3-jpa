package com.praticando.pratica.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.praticando.pratica.entities.User;
import com.praticando.pratica.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		User u1 = new User(null, "João Vieira", "jvieira@gmail.com", "98888888", "123456");
		User u2 = new User(null, "Maria Silva", "msilva@gmail.com", "97777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
	
	
}
