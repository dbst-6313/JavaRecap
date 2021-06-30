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
import hrms.recap.business.abstracts.ProgrammingSkillService;

import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.entities.concretes.ProgrammingSkill;
@RestController
@RequestMapping("/api/programmingskill/")
@CrossOrigin(origins="http://localhost:3000")
public class ProgrammingSkillController {
	
	private ProgrammingSkillService  programmingSkillService;
	@Autowired
	public ProgrammingSkillController(ProgrammingSkillService programmingSkillService) {
		super();
		this.programmingSkillService = programmingSkillService;
	}

	@PostMapping("add")
	public Result add(@RequestBody ProgrammingSkill programmingSkill){
		return this.programmingSkillService.add(programmingSkill);
		
	}
	
	@PostMapping("update")
	public Result update(@RequestBody ProgrammingSkill programmingSkill){
		return this.programmingSkillService.update(programmingSkill);
		
	}
	
	@PostMapping("delete")
	public Result delete(@RequestParam int id){
		return this.programmingSkillService.delete(id);
		
	}
	
	@GetMapping("getall")
	public DataResult<List<ProgrammingSkill>> getAll(){
		return this.programmingSkillService.getAll();
	}
	
	@GetMapping("getAllByJobSeekerId")
	public DataResult<List<ProgrammingSkill>> getAllByJobSeekerId(int id){
		return this.programmingSkillService.getAllByJoBSeekerId(id);
	}
	@GetMapping("getById")
	public DataResult<ProgrammingSkill> getById(int id){
		return this.programmingSkillService.getById(id);
	}

}
