package com.placementportal.model;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Arrays;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "institute")
public class Institute {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long institute_id;		
	private String institute_name;
	private String brand_name;
	private Date start_date;
	private String state;
	private String main_campus_city;
	private String other_campus_city;
	private String founder_name;
	private String director_or_principle;
	private String company_website;
	private String company_linked_in;
	private String any_other_relevant_link;
	private byte[] corporate_presentation;
	private byte[] any_other_file_upload;
	private String specialization;
	private Integer batch_size;
	private Integer no_of_campuses;
	private BigDecimal median_ctc;
	private BigDecimal average_ctc;
	private BigDecimal summer_median_ctc;
	private String preferred_sectors;
	private Date summer_placement;
	private Date final_placement;
	private Date winter_placement;
	private Date live_projects;
	
	public Institute() {
		super();
		
	}

	public Long getInstitute_id() {
		return institute_id;
	}

	public void setInstitute_id(Long institute_id) {
		this.institute_id = institute_id;
	}

	public String getInstitute_name() {
		return institute_name;
	}

	public void setInstitute_name(String institute_name) {
		this.institute_name = institute_name;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getMain_campus_city() {
		return main_campus_city;
	}

	public void setMain_campus_city(String main_campus_city) {
		this.main_campus_city = main_campus_city;
	}

	public String getOther_campus_city() {
		return other_campus_city;
	}

	public void setOther_campus_city(String other_campus_city) {
		this.other_campus_city = other_campus_city;
	}

	public String getFounder_name() {
		return founder_name;
	}

	public void setFounder_name(String founder_name) {
		this.founder_name = founder_name;
	}

	public String getDirector_or_principle() {
		return director_or_principle;
	}

	public void setDirector_or_principle(String director_or_principle) {
		this.director_or_principle = director_or_principle;
	}

	public String getCompany_website() {
		return company_website;
	}

	public void setCompany_website(String company_website) {
		this.company_website = company_website;
	}

	public String getCompany_linked_in() {
		return company_linked_in;
	}

	public void setCompany_linked_in(String company_linked_in) {
		this.company_linked_in = company_linked_in;
	}

	public String getAny_other_relevant_link() {
		return any_other_relevant_link;
	}

	public void setAny_other_relevant_link(String any_other_relevant_link) {
		this.any_other_relevant_link = any_other_relevant_link;
	}

	public byte[] getCorporate_presentation() {
		return corporate_presentation;
	}

	public void setCorporate_presentation(byte[] corporate_presentation) {
		this.corporate_presentation = corporate_presentation;
	}

	public byte[] getAny_other_file_upload() {
		return any_other_file_upload;
	}

	public void setAny_other_file_upload(byte[] any_other_file_upload) {
		this.any_other_file_upload = any_other_file_upload;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public Integer getBatch_size() {
		return batch_size;
	}

	public void setBatch_size(Integer batch_size) {
		this.batch_size = batch_size;
	}

	public Integer getNo_of_campuses() {
		return no_of_campuses;
	}

	public void setNo_of_campuses(Integer no_of_campuses) {
		this.no_of_campuses = no_of_campuses;
	}

	public BigDecimal getMedian_ctc() {
		return median_ctc;
	}

	public void setMedian_ctc(BigDecimal median_ctc) {
		this.median_ctc = median_ctc;
	}

	public BigDecimal getAverage_ctc() {
		return average_ctc;
	}

	public void setAverage_ctc(BigDecimal average_ctc) {
		this.average_ctc = average_ctc;
	}

	public BigDecimal getSummer_median_ctc() {
		return summer_median_ctc;
	}

	public void setSummer_median_ctc(BigDecimal summer_median_ctc) {
		this.summer_median_ctc = summer_median_ctc;
	}

	public String getPreferred_sectors() {
		return preferred_sectors;
	}

	public void setPreferred_sectors(String preferred_sectors) {
		this.preferred_sectors = preferred_sectors;
	}

	public Date getSummer_placement() {
		return summer_placement;
	}

	public void setSummer_placement(Date summer_placement) {
		this.summer_placement = summer_placement;
	}

	public Date getFinal_placement() {
		return final_placement;
	}

	public void setFinal_placement(Date final_placement) {
		this.final_placement = final_placement;
	}

	public Date getWinter_placement() {
		return winter_placement;
	}

	public void setWinter_placement(Date winter_placement) {
		this.winter_placement = winter_placement;
	}

	public Date getLive_projects() {
		return live_projects;
	}

	public void setLive_projects(Date live_projects) {
		this.live_projects = live_projects;
	}

	@Override
	public String toString() {
		return "Institute [institute_id=" + institute_id + ", institute_name=" + institute_name + ", brand_name="
				+ brand_name + ", start_date=" + start_date + ", state=" + state + ", main_campus_city="
				+ main_campus_city + ", other_campus_city=" + other_campus_city + ", founder_name=" + founder_name
				+ ", director_or_principle=" + director_or_principle + ", company_website=" + company_website
				+ ", company_linked_in=" + company_linked_in + ", any_other_relevant_link=" + any_other_relevant_link
				+ ", corporate_presentation=" + Arrays.toString(corporate_presentation) + ", any_other_file_upload="
				+ Arrays.toString(any_other_file_upload) + ", specialization=" + specialization + ", batch_size="
				+ batch_size + ", no_of_campuses=" + no_of_campuses + ", median_ctc=" + median_ctc + ", average_ctc="
				+ average_ctc + ", summer_median_ctc=" + summer_median_ctc + ", preferred_sectors=" + preferred_sectors
				+ ", summer_placement=" + summer_placement + ", final_placement=" + final_placement
				+ ", winter_placement=" + winter_placement + ", live_projects=" + live_projects + ", getInstitute_id()="
				+ getInstitute_id() + ", getInstitute_name()=" + getInstitute_name() + ", getBrand_name()="
				+ getBrand_name() + ", getStart_date()=" + getStart_date() + ", getState()=" + getState()
				+ ", getMain_campus_city()=" + getMain_campus_city() + ", getOther_campus_city()="
				+ getOther_campus_city() + ", getFounder_name()=" + getFounder_name() + ", getDirector_or_principle()="
				+ getDirector_or_principle() + ", getCompany_website()=" + getCompany_website()
				+ ", getCompany_linked_in()=" + getCompany_linked_in() + ", getAny_other_relevant_link()="
				+ getAny_other_relevant_link() + ", getCorporate_presentation()="
				+ Arrays.toString(getCorporate_presentation()) + ", getAny_other_file_upload()="
				+ Arrays.toString(getAny_other_file_upload()) + ", getSpecialization()=" + getSpecialization()
				+ ", getBatch_size()=" + getBatch_size() + ", getNo_of_campuses()=" + getNo_of_campuses()
				+ ", getMedian_ctc()=" + getMedian_ctc() + ", getAverage_ctc()=" + getAverage_ctc()
				+ ", getSummer_median_ctc()=" + getSummer_median_ctc() + ", getPreferred_sectors()="
				+ getPreferred_sectors() + ", getSummer_placement()=" + getSummer_placement()
				+ ", getFinal_placement()=" + getFinal_placement() + ", getWinter_placement()=" + getWinter_placement()
				+ ", getLive_projects()=" + getLive_projects() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	

	
	
}
