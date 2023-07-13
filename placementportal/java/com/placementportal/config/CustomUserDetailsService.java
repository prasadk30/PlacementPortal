package com.placementportal.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.placementportal.model.User;
import com.placementportal.repository.UserRepository;


public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		/*
		 * try {
		 * 
		 * User user=userRepository.findByEmail(email); if(user==null) { throw new
		 * UsernameNotFoundException("No User Found"); }else { return new
		 * CustomUserDetails(user); }
		 * 
		 * 
		 * } catch (Exception e) { e.printStackTrace(); }
		 * 
		 * 
		 * 
		 * return null;
		 */
		
User user=userRepository.getUserByEmail(email);
		
		if(user==null) {
			throw new UsernameNotFoundException("Colud not found user!! ");
		}
		
		CustomUserDetails customUserDetails=new CustomUserDetails(user);
	return customUserDetails;
		
	}

}
