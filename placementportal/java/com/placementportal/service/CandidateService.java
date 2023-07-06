package com.placementportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.placementportal.model.Candidate;
import com.placementportal.repository.CandidateRepository;


@Service
public class CandidateService  {

	@Autowired
	private CandidateRepository candidateRepository;
	
	public List<Candidate> getAllCandidates() {
		return candidateRepository.findAll();
	}

	public void saveCandidate(Candidate candidate) {
		this.candidateRepository.save(candidate);
	}
	
	 public Optional<Candidate> getFileById(Long canidate_id) {
		 return candidateRepository.findById(canidate_id);
		            
	    }

	   
	
	
	public List<Candidate> getCandidateByCriteria(Candidate candidate) {
		return candidateRepository.findCandidateByIgnoreCase(candidate.getCandidate_name(),
				candidate.getCandidate_city(), candidate.getNo_of_years_work_ex(),
				candidate.getWork_mode(), candidate.getJob_or_internship());
	}
	public List<Candidate> candidatesearch(String keyword) {
		if (keyword != null) {
			return candidateRepository.findCandidateByIgnoreCase(keyword);
		}
		return candidateRepository.findAll();
	}
	
	
	

}
