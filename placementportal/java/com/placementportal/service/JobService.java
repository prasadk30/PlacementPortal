package com.placementportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.placementportal.model.Job;
import com.placementportal.repository.JobRepository;

@Service
public class JobService {

	@Autowired
	private JobRepository jobRepository;

	
	public void saveJob(Job job) {
		this.jobRepository.save(job);
	}
	

	public List<Job> findJobList() {
		
		return jobRepository.findAll();
	}

	public List<Job> jobsearch(String keyword) {
		if (keyword != null) {
			return jobRepository.findJobByIgnoreCase(keyword);
		}
		return jobRepository.findAll();
	}
	
	public List<Job> getJobByCriteria(Job job) {
		return jobRepository.findJobByIgnoreCase(job.getPosition(),job.getCountry(), job.getCity(), job.getWork_mode(),
				job.getNo_work_experience(), job.getDescription(), job.getPosition_type());
	}
	
	public Job getJobById(int position_id) {
		Optional<Job> j = jobRepository.findById(position_id);

		if (j.isPresent()) {
			return j.get();
		}
		return null;
	}
}
 