package com.placementportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.placementportal.model.User;
import com.placementportal.repository.UserRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class RegController {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder bp;
	
	
	@GetMapping("/register")
	public String home()
	{
		return "register";
	}
	
	
	@PostMapping("/register")
	public String create(@ModelAttribute User user, HttpSession session)
	{
		System.out.println(user);
		//password encryption 
		user.setPassword(bp.encode(user.getPassword()));
		//user.setRole(user.getRole());
		
		session.setAttribute("msg", "Registration  successfully!");
		userRepository.save(user);
		
		return "redirect:/";
	}
}
