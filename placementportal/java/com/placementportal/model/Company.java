package com.placementportal.model;


import java.time.LocalDate;
import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "company")

public class Company {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long company_ID;

	@Column(nullable = false)
    private String company_name;

	@Column(nullable = false)
    private String brand_name;

	@Column(nullable = false)
    private LocalDate start_date;

	@Column(nullable = false)
    private String head_office_country;

	@Column(nullable = false)
    private String head_office_state;

	@Column(nullable = false)
    private String head_office_city;

	@Column(nullable = false)
    private String founder_name;

	@Column(nullable = false)
    private String ceo_md_name;

	@Column(nullable = false)
    private String company_website;

	@Column(nullable = false)
    private String company_linkedin;

	@Column
    private String other_relevant_link;

	@Column
    private byte[] corporate_presentation;

	@Column
    private byte[] other_file_upload;

	@Column(nullable = false)
    private String revenue;

	@Column(nullable = false)
    private int operating_cities;

	@Column(nullable = false)
    private String sector;

	@Column(nullable = false)
    private String industry;

	@Column(nullable = false)
    private String business_model;

	@Column
    private String competitor;

	@Column(nullable = false)
    private String current_employee_count;

	@Column(nullable = false)
    private int projected_employee_count;

	@Column(nullable = false)
    private int yearly_no_of_hires;

	@Column(nullable = false)
    private int avg_tenure_of_employee;

	public Long getCompany_ID() {
		return company_ID;
	}

	public void setCompany_ID(Long company_ID) {
		this.company_ID = company_ID;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	
	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	public LocalDate getStart_date() {
		return start_date;
	}

	public void setStart_date(LocalDate start_date) {
		this.start_date = start_date;
	}

	public String getHead_office_country() {
		return head_office_country;
	}

	public void setHead_office_country(String head_office_country) {
		this.head_office_country = head_office_country;
	}

	public String getHead_office_state() {
		return head_office_state;
	}

	public void setHead_office_state(String head_office_state) {
		this.head_office_state = head_office_state;
	}

	public String getHead_office_city() {
		return head_office_city;
	}

	public void setHead_office_city(String head_office_city) {
		this.head_office_city = head_office_city;
	}

	public String getFounder_name() {
		return founder_name;
	}

	public void setFounder_name(String founder_name) {
		this.founder_name = founder_name;
	}

	public String getCeo_md_name() {
		return ceo_md_name;
	}

	public void setCeo_md_name(String ceo_md_name) {
		this.ceo_md_name = ceo_md_name;
	}

	public String getCompany_website() {
		return company_website;
	}

	public void setCompany_website(String company_website) {
		this.company_website = company_website;
	}

	public String getCompany_linkedin() {
		return company_linkedin;
	}

	public void setCompany_linkedin(String company_linkedin) {
		this.company_linkedin = company_linkedin;
	}

	public String getOther_relevant_link() {
		return other_relevant_link;
	}

	public void setOther_relevant_link(String other_relevant_link) {
		this.other_relevant_link = other_relevant_link;
	}

	public byte[] getCorporate_presentation() {
		return corporate_presentation;
	}

	public void setCorporate_presentation(byte[] corporate_presentation) {
		this.corporate_presentation = corporate_presentation;
	}

	public byte[] getOther_file_upload() {
		return other_file_upload;
	}

	public void setOther_file_upload(byte[] other_file_upload) {
		this.other_file_upload = other_file_upload;
	}

	public String getRevenue() {
		return revenue;
	}

	public void setRevenue(String revenue) {
		this.revenue = revenue;
	}

	public int getOperating_cities() {
		return operating_cities;
	}

	public void setOperating_cities(int operating_cities) {
		this.operating_cities = operating_cities;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getBusiness_model() {
		return business_model;
	}

	public void setBusiness_model(String business_model) {
		this.business_model = business_model;
	}

	public String getCompetitor() {
		return competitor;
	}

	public void setCompetitor(String competitor) {
		this.competitor = competitor;
	}

	public String getCurrent_employee_count() {
		return current_employee_count;
	}

	public void setCurrent_employee_count(String current_employee_count) {
		this.current_employee_count = current_employee_count;
	}

	public int getProjected_employee_count() {
		return projected_employee_count;
	}

	public void setProjected_employee_count(int projected_employee_count) {
		this.projected_employee_count = projected_employee_count;
	}

	public int getYearly_no_of_hires() {
		return yearly_no_of_hires;
	}

	public void setYearly_no_of_hires(int yearly_no_of_hires) {
		this.yearly_no_of_hires = yearly_no_of_hires;
	}

	public int getAvg_tenure_of_employee() {
		return avg_tenure_of_employee;
	}

	public void setAvg_tenure_of_employee(int avg_tenure_of_employee) {
		this.avg_tenure_of_employee = avg_tenure_of_employee;
	}

	@Override
	public String toString() {
		return "Company [company_ID=" + company_ID + ", company_name=" + company_name + ", brand_name=" + brand_name
				+ ", start_date=" + start_date + ", head_office_country=" + head_office_country + ", head_office_state="
				+ head_office_state + ", head_office_city=" + head_office_city + ", founder_name=" + founder_name
				+ ", ceo_md_name=" + ceo_md_name + ", company_website=" + company_website + ", company_linkedin="
				+ company_linkedin + ", other_relevant_link=" + other_relevant_link + ", corporate_presentation="
				+ Arrays.toString(corporate_presentation) + ", other_file_upload=" + Arrays.toString(other_file_upload)
				+ ", revenue=" + revenue + ", operating_cities=" + operating_cities + ", sector=" + sector
				+ ", industry=" + industry + ", business_model=" + business_model + ", competitor=" + competitor
				+ ", current_employee_count=" + current_employee_count + ", projected_employee_count="
				+ projected_employee_count + ", yearly_no_of_hires=" + yearly_no_of_hires + ", avg_tenure_of_employee="
				+ avg_tenure_of_employee + ", getCompany_ID()=" + getCompany_ID() + ", getCompany_name()="
				+ getCompany_name() + ", getBrand_name()=" + getBrand_name() + ", getStart_date()=" + getStart_date()
				+ ", getHead_office_country()=" + getHead_office_country() + ", getHead_office_state()="
				+ getHead_office_state() + ", getHead_office_city()=" + getHead_office_city() + ", getFounder_name()="
				+ getFounder_name() + ", getCeo_md_name()=" + getCeo_md_name() + ", getCompany_website()="
				+ getCompany_website() + ", getCompany_linkedin()=" + getCompany_linkedin()
				+ ", getOther_relevant_link()=" + getOther_relevant_link() + ", getCorporate_presentation()="
				+ Arrays.toString(getCorporate_presentation()) + ", getOther_file_upload()="
				+ Arrays.toString(getOther_file_upload()) + ", getRevenue()=" + getRevenue()
				+ ", getOperating_cities()=" + getOperating_cities() + ", getSector()=" + getSector()
				+ ", getIndustry()=" + getIndustry() + ", getBusiness_model()=" + getBusiness_model()
				+ ", getCompetitor()=" + getCompetitor() + ", getCurrent_employee_count()="
				+ getCurrent_employee_count() + ", getProjected_employee_count()=" + getProjected_employee_count()
				+ ", getYearly_no_of_hires()=" + getYearly_no_of_hires() + ", getAvg_tenure_of_employee()="
				+ getAvg_tenure_of_employee() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
	
	public Company() {
		super();
	}
    
}

