package com.placementportal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.placementportal.model.Job;



public interface JobRepository extends JpaRepository<Job, Integer> {
	@Query("SELECT j FROM Job j WHERE  j.position = :position " + 
"OR  j.country = :country "+ 
"AND  j.city = :city " + 
"OR  j.no_work_experience = :no_work_experience "+ 
"OR  j.work_mode = :work_mode " +
"OR  j.description = :description " +
"OR  j.position_type = :position_type ")

	List<Job> findJobByIgnoreCase(@Param("position") String position, @Param("country") String country,
			@Param("city") String city, @Param("no_work_experience") String no_work_experience,
			@Param("work_mode") String work_mode,
			@Param("description") String description,
			@Param("position_type") String position_type);
	
	@Query("SELECT j FROM Job j WHERE CONCAT(j.position, ' ', j.description, ' ', j.functions) LIKE %?1%")
	public List<Job> findJobByIgnoreCase(String keyword);
}
