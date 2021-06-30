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

import hrms.recap.business.abstracts.LanguageService;
import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.entities.concretes.Language;

@RestController
@RequestMapping("/api/language")
@CrossOrigin(origins="http://localhost:3000")
public class LanguageController {
	
	private LanguageService  languageService;
	
	@Autowired
	public LanguageController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	@PostMapping("add")
	public Result add(@RequestBody Language language){
		return this.languageService.add(language);
		
	}
	
	@PostMapping("update")
	public Result update(@RequestBody Language language){
		return this.languageService.update(language);
		
	}
	
	@PostMapping("delete")
	public Result delete(@RequestParam int id){
		return this.languageService.delete(id);
		
	}
	
	@GetMapping("getall")
	public DataResult<List<Language>> getAll(){
		return this.languageService.getAll();
	}
	
	@GetMapping("getAllByJobSeekerId")
	public DataResult<List<Language>> getAllByJobSeekerId(int id){
		return this.languageService.getAllByJoBSeekerId(id);
	}
	@GetMapping("getById")
	public DataResult<Language> getById(int id){
		return this.languageService.getById(id);
	}

}
