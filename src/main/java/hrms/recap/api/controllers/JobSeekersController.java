package hrms.recap.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import hrms.recap.business.abstracts.JobSeekersService;
import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/jobseekers")
public class JobSeekersController {
	@Autowired
	private JobSeekersService jobSeekersService;
    @GetMapping("/getall")
	public DataResult<List<JobSeeker>> getAll(){
		return this.jobSeekersService.getAll();
	}
    @PostMapping("/add")
	public Result add(JobSeeker jobSeeker){
    	
		return this.jobSeekersService.add(jobSeeker);
	}
}
