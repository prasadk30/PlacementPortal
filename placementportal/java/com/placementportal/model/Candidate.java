package com.placementportal.model;

import java.math.BigDecimal;
import java.util.Arrays;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Candidate {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long candidate_id;
	
	private String candidate_name;
	
	private byte[] cv_upload;
	
	private byte[] other_relevant_upload;
	
	private String primary_skills;
	
	private String secondary_skills;
	
	private String experience;
	
	private Integer no_of_years_work_ex;
	
	private String work_mode;
	
	private String gender;
	
	private String candidate_city;
	
	private String ic_or_manager;
	
	private String ctc_fixed;
	
	private BigDecimal ctc_variable;
	
	private BigDecimal ctc_total;
	
	private String job_or_internship;
	
	

	public Candidate() {
		super();
	}



	public Long getCandidate_id() {
		return candidate_id;
	}



	public void setCandidate_id(Long candidate_id) {
		this.candidate_id = candidate_id;
	}



	public String getCandidate_name() {
		return candidate_name;
	}



	public void setCandidate_name(String candidate_name) {
		this.candidate_name = candidate_name;
	}



	public byte[] getCv_upload() {
		return cv_upload;
	}



	public void setCv_upload(byte[] cv_upload) {
		this.cv_upload = cv_upload;
	}



	public byte[] getOther_relevant_upload() {
		return other_relevant_upload;
	}



	public void setOther_relevant_upload(byte[] other_relevant_upload) {
		this.other_relevant_upload = other_relevant_upload;
	}



	public String getPrimary_skills() {
		return primary_skills;
	}



	public void setPrimary_skills(String primary_skills) {
		this.primary_skills = primary_skills;
	}



	public String getSecondary_skills() {
		return secondary_skills;
	}



	public void setSecondary_skills(String secondary_skills) {
		this.secondary_skills = secondary_skills;
	}



	public String getExperience() {
		return experience;
	}



	public void setExperience(String experience) {
		this.experience = experience;
	}



	public Integer getNo_of_years_work_ex() {
		return no_of_years_work_ex;
	}



	public void setNo_of_years_work_ex(Integer no_of_years_work_ex) {
		this.no_of_years_work_ex = no_of_years_work_ex;
	}



	public String getWork_mode() {
		return work_mode;
	}



	public void setWork_mode(String work_mode) {
		this.work_mode = work_mode;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getCandidate_city() {
		return candidate_city;
	}



	public void setCandidate_city(String candidate_city) {
		this.candidate_city = candidate_city;
	}



	public String getIc_or_manager() {
		return ic_or_manager;
	}



	public void setIc_or_manager(String ic_or_manager) {
		this.ic_or_manager = ic_or_manager;
	}



	public String getCtc_fixed() {
		return ctc_fixed;
	}



	public void setCtc_fixed(String ctc_fixed) {
		this.ctc_fixed = ctc_fixed;
	}



	public BigDecimal getCtc_variable() {
		return ctc_variable;
	}



	public void setCtc_variable(BigDecimal ctc_variable) {
		this.ctc_variable = ctc_variable;
	}



	public BigDecimal getCtc_total() {
		return ctc_total;
	}



	public void setCtc_total(BigDecimal ctc_total) {
		this.ctc_total = ctc_total;
	}



	public String getJob_or_internship() {
		return job_or_internship;
	}



	public void setJob_or_internship(String job_or_internship) {
		this.job_or_internship = job_or_internship;
	}



	@Override
	public String toString() {
		return "Candidate [candidate_id=" + candidate_id + ", candidate_name=" + candidate_name + ", cv_upload="
				+ Arrays.toString(cv_upload) + ", other_relevant_upload=" + Arrays.toString(other_relevant_upload)
				+ ", primary_skills=" + primary_skills + ", secondary_skills=" + secondary_skills + ", experience="
				+ experience + ", no_of_years_work_ex=" + no_of_years_work_ex + ", work_mode=" + work_mode + ", gender="
				+ gender + ", candidate_city=" + candidate_city + ", ic_or_manager=" + ic_or_manager + ", ctc_fixed="
				+ ctc_fixed + ", ctc_variable=" + ctc_variable + ", ctc_total=" + ctc_total + ", job_or_internship="
				+ job_or_internship + ", getCandidate_id()=" + getCandidate_id() + ", getCandidate_name()="
				+ getCandidate_name() + ", getCv_upload()=" + Arrays.toString(getCv_upload())
				+ ", getOther_relevant_upload()=" + Arrays.toString(getOther_relevant_upload())
				+ ", getPrimary_skills()=" + getPrimary_skills() + ", getSecondary_skills()=" + getSecondary_skills()
				+ ", getExperience()=" + getExperience() + ", getNo_of_years_work_ex()=" + getNo_of_years_work_ex()
				+ ", getWork_mode()=" + getWork_mode() + ", getGender()=" + getGender() + ", getCandidate_city()="
				+ getCandidate_city() + ", getIc_or_manager()=" + getIc_or_manager() + ", getCtc_fixed()="
				+ getCtc_fixed() + ", getCtc_variable()=" + getCtc_variable() + ", getCtc_total()=" + getCtc_total()
				+ ", getJob_or_internship()=" + getJob_or_internship() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
}
