package com.csi.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.csi.boot.model.User;
import com.csi.boot.repository.UserRepository;

@SpringBootApplication
public class SpringBootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Ganesh", "Bidve", "ganeshbidve07@gmail.com"));
		this.userRepository.save(new User("Pradeep", "Maddhe", "pradeepmaddhe@gmail.com"));
		this.userRepository.save(new User("RUpesh", "Ahire", "rupeshahire@gmail.com"));
	}

}
