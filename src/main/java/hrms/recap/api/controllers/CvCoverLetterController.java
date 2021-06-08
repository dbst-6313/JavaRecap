package hrms.recap.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hrms.recap.business.abstracts.CvCoverLetterService;
import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.Result;

import hrms.recap.entities.concretes.CvCoverLetter;
@RestController
@RequestMapping("/api/cvcoverletter/")
public class CvCoverLetterController {

		private CvCoverLetterService  cvCoverLetterService;
	@Autowired
	public CvCoverLetterController(CvCoverLetterService cvCoverLetterService) {
		super();
		this.cvCoverLetterService = cvCoverLetterService;
	}

	@PostMapping("add")
	public Result add(@RequestBody CvCoverLetter cvCoverLetter){
		return this.cvCoverLetterService.add(cvCoverLetter);
		
	}
	
	@PostMapping("update")
	public Result update(@RequestBody CvCoverLetter cvCoverLetter){
		return this.cvCoverLetterService.update(cvCoverLetter);
		
	}
	
	@PostMapping("delete")
	public Result delete(@RequestParam int id){
		return this.cvCoverLetterService.delete(id);
		
	}
	
	@GetMapping("getall")
	public DataResult<List<CvCoverLetter>> getAll(){
		return this.cvCoverLetterService.getAll();
	}
	
	@GetMapping("getAllByJobSeekerId")
	public DataResult<List<CvCoverLetter>> getAllByJobSeekerId(int id){
		return this.cvCoverLetterService.getAllByJoBSeekerId(id);
	}
	@GetMapping("getById")
	public DataResult<CvCoverLetter> getById(int id){
		return this.cvCoverLetterService.getById(id);
	}

}
