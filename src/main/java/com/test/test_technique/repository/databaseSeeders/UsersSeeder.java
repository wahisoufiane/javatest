package com.test.test_technique.repository.databaseSeeders;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.test.test_technique.domain.User;
import com.test.test_technique.repository.UserRepository;

@Component
public class UsersSeeder implements CommandLineRunner {
	
	
	@Autowired
	private UserRepository UserRepository;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(" Users Seeder");
	
		if(this.UserRepository.findAll().isEmpty())
		{
			User u1 = new User();
			u1.setNom("amine");
			u1.setPrenom("med");
			u1.setEmail("amine@amine.com");
			u1.setPassword("password00");
			u1.setExipirationDate(new Date(0));
			
			u1.setPhotoPath("/image/photo1.png");
			
			this.UserRepository.save(u1);
			
		}
	}

}
