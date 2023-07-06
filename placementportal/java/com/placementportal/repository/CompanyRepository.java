package com.placementportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.placementportal.model.Company;


public interface CompanyRepository extends JpaRepository<Company, Long>{

}
