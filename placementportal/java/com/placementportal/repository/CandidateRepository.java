package com.placementportal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.placementportal.model.Candidate;



public interface CandidateRepository extends JpaRepository<Candidate,Long> {
	@Query("SELECT c FROM Candidate c WHERE  c.candidate_name = :candidate_name "
			+ "AND  c.candidate_city = :candidate_city "
			+ "OR  c.no_of_years_work_ex= :no_of_years_work_ex "
			+ "OR  c.work_mode = :work_mode "
			+ "AND  c.job_or_internship = :job_or_internship ")

	List<Candidate> findCandidateByIgnoreCase(@Param("candidate_name") String candidate_name,
			 @Param("candidate_city") String candidate_city,
			@Param("no_of_years_work_ex") int no_of_years_work_ex,
			@Param("work_mode") String work_mode,
			@Param("job_or_internship") String job_or_internship);
	
	@Query("SELECT c FROM Candidate c WHERE CONCAT(c.candidate_name, ' ', c.primary_skills, ' ', c.secondary_skills, ' ',c.gender) LIKE %?1%")
	public List<Candidate> findCandidateByIgnoreCase(String keyword);
}
