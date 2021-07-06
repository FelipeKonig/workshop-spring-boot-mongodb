package com.felipekonig.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.felipekonig.workshopmongo.domain.User;
import com.felipekonig.workshopmongo.repository.UserRepository;

@Configuration
public class Instantion implements CommandLineRunner {

	@Autowired
	UserRepository repo;
	
	@Override
	public void run(String... args) throws Exception {

		repo.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		repo.saveAll(Arrays.asList(maria, alex, bob));
	}

}
