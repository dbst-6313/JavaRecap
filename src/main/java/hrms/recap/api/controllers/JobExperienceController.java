package hrms.recap.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import hrms.recap.business.abstracts.JobExperienceService;
import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.entities.concretes.JobExperience;

@RestController
@RequestMapping("/api/jobexperience/")
public class JobExperienceController {
	
	private JobExperienceService  jobExperienceService;
	@Autowired
	public JobExperienceController(JobExperienceService jobExperienceService) {
		super();
		this.jobExperienceService = jobExperienceService;
	}

	@PostMapping("add")
	public Result add(@RequestBody JobExperience jobExperience){
		return this.jobExperienceService.add(jobExperience);
		
	}
	
	@PostMapping("update")
	public Result update(JobExperience jobExperience){
		return this.jobExperienceService.update(jobExperience);
		
	}
	
	@PostMapping("delete")
	public Result delete(int id){
		return this.jobExperienceService.delete(id);
		
	}
	
	@GetMapping("getall")
	public DataResult<List<JobExperience>> getAll(){
		return this.jobExperienceService.getAll();
	}
	
	@GetMapping("getAllByJobSeekerId")
	public DataResult<List<JobExperience>> getAllByJobSeekerId(int id){
		return this.jobExperienceService.getAllByJoBSeekerId(id);
	}
	@GetMapping("getById")
	public DataResult<JobExperience> getById(int id){
		return this.jobExperienceService.getById(id);
	}

}
