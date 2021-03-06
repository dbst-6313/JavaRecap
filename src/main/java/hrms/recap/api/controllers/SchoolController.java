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
import hrms.recap.business.abstracts.SchoolService;
import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.entities.concretes.School;
@RestController
@RequestMapping("/api/school/")
@CrossOrigin(origins="http://localhost:3000")
public class SchoolController {

		private SchoolService  schoolService;
	
	@Autowired
	public SchoolController(SchoolService schoolService) {
		super();
		this.schoolService = schoolService;
	}
	@PostMapping("add")
	public Result add(@RequestBody School school){
		return this.schoolService.add(school);
		
	}
	
	@PostMapping("update")
	public Result update(@RequestBody School school){
		return this.schoolService.update(school);
		
	}
	
	@PostMapping("delete")
	public Result delete(@RequestParam int id){
		return this.schoolService.delete(id);
		
	}
	
	@GetMapping("getall")
	public DataResult<List<School>> getAll(){
		return this.schoolService.getAll();
	}
	
	@GetMapping("getAllByJobSeekerId")
	public DataResult<List<School>> getAllByJobSeekerId(int id){
		return this.schoolService.getAllByJoBSeekerId(id);
	}
	@GetMapping("getById")
	public DataResult<School> getById(int id){
		return this.schoolService.getById(id);
	}

}
