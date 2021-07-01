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


import hrms.recap.business.concretes.VerificationPendingEmployerManager;
import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.entities.concretes.VerificationPendingEmployer;

@RestController
@RequestMapping("/api/verificationpendingemployer/")
@CrossOrigin(origins="http://localhost:3000")
public class VerificationPendingEmployerController {

	@Autowired VerificationPendingEmployerManager verificationPendinEmployerManager;
	@GetMapping("getall")
	public DataResult<List<VerificationPendingEmployer>> getAll(){
		return this.verificationPendinEmployerManager.getAll();
	}
	@GetMapping("getbyid")
	public DataResult<VerificationPendingEmployer> getById(@RequestParam int id){
		return this.verificationPendinEmployerManager.getById(id);
	}
	@PostMapping("add")
	public Result add(@RequestBody VerificationPendingEmployer verificationPendingEmployer) {
		return this.verificationPendinEmployerManager.add(verificationPendingEmployer);
	}
	@PostMapping("delete")
	public Result delete(@RequestBody VerificationPendingEmployer verificationPendingEmployer) {
		return this.verificationPendinEmployerManager.delete(verificationPendingEmployer);
	}
}
