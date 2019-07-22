package com.test.test_technique.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.test.test_technique.repository.UserRepository;

import com.test.test_technique.domain.*;


@Controller
public class UserController {
	
	@Autowired
	private UserRepository UserRepository;
	
	private List<User> users ;
	
	@GetMapping(path = "/create")
	public String create() {
		
		return "createUSer";
		
	}
	
	@GetMapping(path ="/users")
	public String getList(Model model) {
		this.users = this.UserRepository.findAll();
		model.addAttribute("users",this.users);
		return "users";
	}

}
