package com.placementportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.placementportal.model.Institute;
import com.placementportal.repository.InstituteRepository;

@Service
public class InstituteService {


	
	
	@Autowired
	private InstituteRepository instituteRepository;

	public List<Institute> getAllInstitute() {
	
		return instituteRepository.findAll();
	}

	public void saveInstitute(Institute institute) {
		
		instituteRepository.save(institute);
	}
}
