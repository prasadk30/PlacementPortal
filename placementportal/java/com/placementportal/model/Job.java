package com.placementportal.model;

import java.util.Arrays;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "position")
public class Job {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int position_id;
	private String position;
	private String designation;
	private String functions;
	private String department;
	private String country;
	private String city;
	private String core_area;
	private String experience;
	private String no_work_experience;
	private String work_mode;
	private String gender;
	private String local_candidate;
	private String ic_team_handling;
	private int stipend;
	private int ctc_variable;
	private String any_notable_perk;
	private String description;
	private byte[] relevent_file;
	private String any_relevant_link;
	private String position_type;
	
	
	
	@Override
	public String toString() {
		return "Job [position_id=" + position_id + ", position=" + position + ", designation=" + designation
				+ ", functions=" + functions + ", department=" + department + ", country=" + country + ", city=" + city
				+ ", core_area=" + core_area + ", experience=" + experience + ", no_work_experience="
				+ no_work_experience + ", work_mode=" + work_mode + ", gender=" + gender + ", local_candidate="
				+ local_candidate + ", ic_team_handling=" + ic_team_handling + ", stipend=" + stipend
				+ ", ctc_variable=" + ctc_variable + ", any_notable_perk=" + any_notable_perk + ", description="
				+ description + ", relevent_file=" + Arrays.toString(relevent_file) + ", any_relevant_link="
				+ any_relevant_link + ", position_type=" + position_type + ", getPosition_id()=" + getPosition_id()
				+ ", getPosition()=" + getPosition() + ", getDesignation()=" + getDesignation() + ", getFunctions()="
				+ getFunctions() + ", getDepartment()=" + getDepartment() + ", getCountry()=" + getCountry()
				+ ", getCity()=" + getCity() + ", getCore_area()=" + getCore_area() + ", getExperience()="
				+ getExperience() + ", getNo_work_experience()=" + getNo_work_experience() + ", getWork_mode()="
				+ getWork_mode() + ", getGender()=" + getGender() + ", getLocal_candidate()=" + getLocal_candidate()
				+ ", getIc_team_handling()=" + getIc_team_handling() + ", getStipend()=" + getStipend()
				+ ", getCtc_variable()=" + getCtc_variable() + ", getAny_notable_perk()=" + getAny_notable_perk()
				+ ", getDescription()=" + getDescription() + ", getRelevent_file()="
				+ Arrays.toString(getRelevent_file()) + ", getAny_relevant_link()=" + getAny_relevant_link()
				+ ", getPosition_type()=" + getPosition_type() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}



	public int getPosition_id() {
		return position_id;
	}



	public void setPosition_id(int position_id) {
		this.position_id = position_id;
	}



	public String getPosition() {
		return position;
	}



	public void setPosition(String position) {
		this.position = position;
	}



	public String getDesignation() {
		return designation;
	}



	public void setDesignation(String designation) {
		this.designation = designation;
	}



	public String getFunctions() {
		return functions;
	}



	public void setFunctions(String functions) {
		this.functions = functions;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getCore_area() {
		return core_area;
	}



	public void setCore_area(String core_area) {
		this.core_area = core_area;
	}



	public String getExperience() {
		return experience;
	}



	public void setExperience(String experience) {
		this.experience = experience;
	}



	public String getNo_work_experience() {
		return no_work_experience;
	}



	public void setNo_work_experience(String no_work_experience) {
		this.no_work_experience = no_work_experience;
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



	public String getLocal_candidate() {
		return local_candidate;
	}



	public void setLocal_candidate(String local_candidate) {
		this.local_candidate = local_candidate;
	}



	public String getIc_team_handling() {
		return ic_team_handling;
	}



	public void setIc_team_handling(String ic_team_handling) {
		this.ic_team_handling = ic_team_handling;
	}



	public int getStipend() {
		return stipend;
	}



	public void setStipend(int stipend) {
		this.stipend = stipend;
	}



	public int getCtc_variable() {
		return ctc_variable;
	}



	public void setCtc_variable(int ctc_variable) {
		this.ctc_variable = ctc_variable;
	}



	public String getAny_notable_perk() {
		return any_notable_perk;
	}



	public void setAny_notable_perk(String any_notable_perk) {
		this.any_notable_perk = any_notable_perk;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public byte[] getRelevent_file() {
		return relevent_file;
	}



	public void setRelevent_file(byte[] relevent_file) {
		this.relevent_file = relevent_file;
	}



	public String getAny_relevant_link() {
		return any_relevant_link;
	}



	public void setAny_relevant_link(String any_relevant_link) {
		this.any_relevant_link = any_relevant_link;
	}



	public String getPosition_type() {
		return position_type;
	}



	public void setPosition_type(String position_type) {
		this.position_type = position_type;
	}



	public Job() {
		super();
	}



	

	

}