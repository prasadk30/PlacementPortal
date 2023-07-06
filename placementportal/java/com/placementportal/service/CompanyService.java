package com.placementportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.placementportal.model.Company;
import com.placementportal.repository.CompanyRepository;
@Service
public class CompanyService{
	@Autowired
	private CompanyRepository companyRepository;
	public List<Company> getAllCompanies() {
		return companyRepository.findAll();
	}
	public void saveCompany(Company company) {
		this.companyRepository.save(company);	
	}
	
}
