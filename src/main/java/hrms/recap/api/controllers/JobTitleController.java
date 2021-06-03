package hrms.recap.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.recap.business.abstracts.JobTitleService;
import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.entities.concretes.JobTitle;

@RestController
@RequestMapping("api/jobtitle/")
public class JobTitleController {
	@Autowired
    private JobTitleService jobTitleService;
	
	@GetMapping("getall")
	public DataResult<List<JobTitle>> getAll(){
		return this.jobTitleService.getAll();
	}
	@PostMapping("add")
	public Result add(JobTitle jobTitle) {
		return this.jobTitleService.add(jobTitle);
	}
}
