package hrms.recap.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hrms.recap.business.abstracts.JobSeekerService;
import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.entities.concretes.JobSeeker;
import hrms.recap.entities.dtos.CvDto;


@RestController
@RequestMapping("/api/jobseekers/")
@CrossOrigin(origins="http://localhost:3000")
public class JobSeekerController {
 
	@Autowired
	private JobSeekerService jobSeekerService;
	
	@GetMapping("getall")
	public DataResult<List<JobSeeker>> getAll(){
		return this.jobSeekerService.getAll();
	}
	@GetMapping("getbyid")
	public DataResult<JobSeeker> getById(@RequestParam int id){
		return this.jobSeekerService.getById(id);
	}
	@PostMapping("update")
	public Result update(@RequestBody JobSeeker jobSeeker) {
		return this.jobSeekerService.update(jobSeeker);
	}
	
	@PostMapping("add")
	public Result add(@RequestBody JobSeeker jobSeeker) {
		return this.jobSeekerService.add(jobSeeker);
		
	}
    
	@GetMapping("getcvbyjobseekerid")
	public DataResult<CvDto> getCvByJobSeekerId(@RequestParam int id) {
		return this.jobSeekerService.getCvByJobSeekerId(id);
	}

}
