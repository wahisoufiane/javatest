package com.test.test_technique.repository.databaseSeeders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.test.test_technique.domain.Profile;
import com.test.test_technique.repository.ProfileRepository;

@Component
public class ProfilesSeeder implements CommandLineRunner {
	
	@Autowired
	private ProfileRepository ProfileRepository;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(" * * * * * * Profiles Seeder * * * * ** *");
		
		//Create the profiles..
		Profile p1 = new Profile();
		p1.setLabel("Apprenant");
		p1.setDescription("Something");
		
		
		Profile p2 = new Profile();
		p2.setLabel("Profile 2");
		p2.setDescription("Something");
		
		Profile p3 = new Profile();
		p3.setLabel("Profile 3");
		p3.setDescription("Something");
		
		if(this.ProfileRepository.findAll().isEmpty()) {
			//Save to the database...
			this.ProfileRepository.save(p1);
			this.ProfileRepository.save(p2);
			this.ProfileRepository.save(p3);
		}
		else
			System.out.println("All good ..!");

		
		System.out.println(" * * * * * * * * * * * * * * * * * * ** *");
	}
}
