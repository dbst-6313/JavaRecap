package hrms.recap.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.recap.business.concretes.EmployerManager;
import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employer/")
@CrossOrigin(origins="http://localhost:3000")
public class EmployerController {
       @Autowired
	   private EmployerManager employerManager;
       
       @GetMapping("getall")
       public DataResult<List<Employer>> getAll(){
    	   return this.employerManager.getAll();
       }
       @PostMapping("add")
       public Result add(@RequestBody Employer employer) {
    	   return this.employerManager.add(employer);
       }
}
