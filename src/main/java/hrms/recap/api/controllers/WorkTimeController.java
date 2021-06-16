package hrms.recap.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.recap.business.abstracts.WorkTimeService;
import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.entities.concretes.WorkTime;

@RestController
@RequestMapping("/api/worktime/")
@CrossOrigin(origins="http://localhost:3000")
public class WorkTimeController {
	@Autowired
	private WorkTimeService workTimeService;
	
	@GetMapping("getall")
	public DataResult<List<WorkTime>> getAll(){
		return this.workTimeService.getAll();
	}
}
