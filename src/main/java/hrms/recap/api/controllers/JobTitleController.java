package hrms.recap.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.recap.business.abstracts.JobService;
import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.entities.concretes.Job;

@RestController
@RequestMapping("api/jobtitle/")
@CrossOrigin(origins="http://localhost:3000")
public class JobTitleController {
	@Autowired
    private JobService jobService;
	
	@GetMapping("getall")
	public DataResult<List<Job>> getAll(){
		return this.jobService.getAll();
	}
	@PostMapping("add")
	public Result add(@RequestBody Job job) {
		return this.jobService.add(job);
	}
}
