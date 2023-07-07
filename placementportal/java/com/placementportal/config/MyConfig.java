package com.placementportal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class MyConfig{

	@Bean
	public UserDetailsService getUserDetailsService()
	{
		return new CustomUserDetailsService();
	}
	
	@Bean
	public BCryptPasswordEncoder getPassword()
	{
		 return new BCryptPasswordEncoder();
	}
	
	// diffrent type provider in spring perform into database
	
	@Bean
	public DaoAuthenticationProvider daoAuthenticationProvider()
	{
		DaoAuthenticationProvider dao=new DaoAuthenticationProvider();
		// set userdetailservice object
		dao.setUserDetailsService(getUserDetailsService());
		dao.setPasswordEncoder(getPassword());
		return dao;
	}
	
	 @Bean
	    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	        
		 http.authorizeRequests().requestMatchers("/user/**").hasRole("ADMIN").requestMatchers("/**").permitAll()
		 .and().formLogin().and().csrf().disable();
		 
		 
	        return http.build();
	    }

}
