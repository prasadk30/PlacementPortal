package com.placementportal.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import java.io.IOException;
import java.util.Optional;
import org.springframework.data.repository.query.Param;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.placementportal.model.Company;
import com.placementportal.model.Institute;
import com.placementportal.model.Job;
import com.placementportal.model.Candidate;
import com.placementportal.service.CompanyService;
import com.placementportal.service.InstituteService;
import com.placementportal.service.JobService;
import com.placementportal.service.CandidateService;
  
@Controller
public class MainController {
	@Autowired
	private JobService jobService;
	
	@Autowired
	private CompanyService companyService;
	
	@Autowired(required = true)
	private InstituteService institueService; 	

	@Autowired(required = true)
	private CandidateService candidateService;
	  
	@GetMapping("/")
	public String startupjobDesc(Model model) {
		Job job = new Job();
		model.addAttribute("job", job);
		return "index";
	}
	
	@PostMapping("/saveJob")
	public String saveJob(@ModelAttribute("job") Job job) {
		jobService.saveJob(job);
		return ("redirect:/jobopening");
	}

	@GetMapping("/joblistfilters")
	public String joblistfilters(Model model,@Param("keyword") String keyword) {
		List<Job> listJob = jobService.jobsearch(keyword);
		model.addAttribute("listJob", listJob);
		model.addAttribute("keyword", keyword);
		System.out.println(listJob);
		System.out.println(keyword);
		return "joblistfilters";
	}
	
	@GetMapping("/joblistfilters/{position_id}")
	public String getJobDetails(@PathVariable int position_id, Model model) {
		Job position = jobService.getJobById(position_id);
		model.addAttribute("position", position);
		List<Candidate> listcandidate = candidateService.getAllCandidates();
		model.addAttribute("listcandidate", listcandidate);
		System.out.println(listcandidate);
		return "candidatelistfilters";
	}

	@GetMapping("/cvdownload/{candidate_id}")
	public ResponseEntity<Resource> downloadFile1(@PathVariable long candidate_id) throws IOException {
        Optional<Candidate> fileEntityOptional = candidateService.getFileById(candidate_id);
        if (fileEntityOptional.isPresent()) {
        	Candidate candidate = fileEntityOptional.get();
            ByteArrayResource resource = new ByteArrayResource(candidate.getCv_upload());

            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_DISPOSITION)
                    .contentType(MediaType.APPLICATION_OCTET_STREAM)
                    .contentLength(candidate.getCv_upload().length)
                    .body(resource);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping(value = "/cvdownload/{candidate_id}", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    @ResponseBody
    public byte[] downloadFileAsAttachment(@PathVariable Long candidate_id) throws IOException {
        Optional<Candidate> fileEntityOptional = candidateService.getFileById(candidate_id);
        if (fileEntityOptional.isPresent()) {
            Candidate candidate = fileEntityOptional.get();
            return candidate.getCv_upload();
        }
        return null;
    }
    
	@GetMapping("/candidatelistfilters/{position_id}")
	public String candidatesearch(Model model,@Param("keyword") String keyword,@PathVariable int position_id) {
		List<Candidate> listJob = candidateService.candidatesearch(keyword);
		Job position = jobService.getJobById(position_id);
		model.addAttribute("position", position);
		model.addAttribute("listJob", listJob);
		model.addAttribute("keyword", keyword);
		System.out.println(listJob);
		System.out.println(keyword);
		return "candidatelistfilters";
	}
	
	@GetMapping("/jobfilter")
	public String getJobByCriteria(@ModelAttribute("job") Job job, Model model) {
		List<Job> listJob = jobService.getJobByCriteria(job);
		model.addAttribute("listJob", listJob);
		System.out.println(listJob);
		return "joblistfilters";
	}
	
	@GetMapping("/index")
	public ModelAndView homepage() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	 
	@GetMapping("/jobopening")
	public ModelAndView jobopening() {
		ModelAndView mav = new ModelAndView("jobopening");
		return mav;
	}
	
	@GetMapping("/register")
	public ModelAndView register() {
		ModelAndView mav = new ModelAndView("register");
		return mav;
	}
	@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}
	
	//Company Controllers
	@PostMapping("/saveCompany")
	public String saveCompany(@ModelAttribute("company") Company company) {
		companyService.saveCompany(company);
		return("redirect:/");
	}
	
	@GetMapping("/CompanyList")
	public String showCompany(Model model) {
		model.addAttribute("listCompanies",companyService.getAllCompanies());
		return "CompanyList";
	}
	
	@GetMapping("/startup_onboarding")
	public String startup_onboarding(Model model) {
		Company company = new Company();
		model.addAttribute("company", company);
		return("startup_onboarding"); 
	}
	
	//Institute Controller
	@GetMapping("/institute_onboarding")
	public String institute_onboarding(Model model) {
		Institute institute = new Institute();
		model.addAttribute("institute", institute);
		return("institute_onboarding"); 
	}

	@PostMapping("/saveInstitute")
	public String saveInstitute(@ModelAttribute("institute") Institute institute) {
		institueService.saveInstitute(institute);
	    return "redirect:/";
	}
	
	//Candidate COntroller	
	@GetMapping("/candidate_registration")
	public String candidateregistration(Model model) {
		Candidate candidate = new Candidate();
		model.addAttribute("candidate", candidate);
		return("candidate_registration"); 
	}
	
	@PostMapping("/saveCandidate")
	public String saveCandidate(@ModelAttribute("candidate") Candidate candidate) {
	    candidateService.saveCandidate(candidate);
	    return "redirect:/candidate_registration";
	}
	
}

  