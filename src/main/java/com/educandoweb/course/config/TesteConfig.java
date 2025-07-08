package com.educandoweb.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.OrderRepository;
import com.educandoweb.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Charles", "charles@gmail.com", "92863019", "17209");
		User u2 = new User(null, "Henrique", "henrique@gmail.com", "60912788", "76140");
		
		Order o1 = new Order(null, Instant.parse("2025-06-20T19:53:00Z"), u1);
		Order o2 = new Order(null, Instant.parse("2025-07-09T12:29:41Z"), u2);
		Order o3 = new Order(null, Instant.parse("2025-06-27T15:09:18Z"), u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
}
