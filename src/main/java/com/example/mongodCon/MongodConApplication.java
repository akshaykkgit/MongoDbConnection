package com.example.mongodCon;

import com.example.mongodCon.model.User;
import com.example.mongodCon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MongodConApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;


	public static void main(String[] args) {
		SpringApplication.run(MongodConApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		if(userRepository.findAll().isEmpty()) {
			userRepository.save(new User("Akshay", "KK"));
		}
		for(User user:userRepository.findAll()) {
			System.out.println(user.getFirstName()+":"+user.getLastName());
		}


	}
	@Bean
	public RestTemplate getTemplate(){
		return new RestTemplate();
	}
}
