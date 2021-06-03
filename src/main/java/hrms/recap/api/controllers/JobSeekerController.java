package hrms.recap.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.recap.business.abstracts.JobSeekerService;
import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/jobseekers/")
public class JobSeekerController {
 
	@Autowired
	private JobSeekerService jobSeekerService;
	
	@GetMapping("getall")
	public DataResult<List<JobSeeker>> getAll(){
		return this.jobSeekerService.getAll();
	}
	
	@PostMapping("add")
	public Result add(JobSeeker jobSeeker) {
		return this.jobSeekerService.add(jobSeeker);
		
	}
}