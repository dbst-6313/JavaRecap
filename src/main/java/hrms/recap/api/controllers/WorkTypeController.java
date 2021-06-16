package hrms.recap.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.recap.business.abstracts.WorkTypeService;
import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.entities.concretes.WorkType;

@RestController
@RequestMapping("/api/worktype/")
@CrossOrigin(origins="http://localhost:3000")
public class WorkTypeController {

	@Autowired
	private WorkTypeService workTypeService;
	
	@GetMapping("getall")
	public DataResult<List<WorkType>> getAll(){
		return this.workTypeService.getAll();
	}
}
