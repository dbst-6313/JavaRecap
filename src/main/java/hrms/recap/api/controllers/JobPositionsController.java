package hrms.recap.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.recap.business.abstracts.JobPositionsService;
import hrms.recap.entities.concretes.JobPositions;

@RestController
@RequestMapping("/api/jobpositions")
public class JobPositionsController {
	
    private JobPositionsService jobPositionsService;
    @Autowired
	public JobPositionsController(JobPositionsService jobPositionsService) {
		this.jobPositionsService = jobPositionsService;
	}
	@GetMapping("/getall")
	public List<JobPositions> getAll(){
		return jobPositionsService.getAll();
	}
}
