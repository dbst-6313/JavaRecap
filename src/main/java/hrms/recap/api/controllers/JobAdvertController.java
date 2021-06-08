package hrms.recap.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.recap.business.abstracts.JobAdvertService;
import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.entities.concretes.JobAdvert;

@RestController
@RequestMapping("/api/jobadvert/")
public class JobAdvertController {
       @Autowired
       private JobAdvertService jobAdvertService;
       
       @GetMapping("getActiveAdverts")
       public DataResult<List<JobAdvert>> getActiveAdverts(){
    	   return this.jobAdvertService.getActiveJobAdverts();
       }
       @GetMapping("getActiveAdvertsSorted")
       public DataResult<List<JobAdvert>> getActiveAdvertsSorted(){
    	   return this.jobAdvertService.getActiveJobAdvertsSorted();
       }
       @GetMapping("getActiveAdvertsByEmployerId")
       public DataResult<List<JobAdvert>> getActiveAdvertsByEmployer(int employerId){
    	   return this.jobAdvertService.getActiveJobAdvertsByEmployer(employerId);
       }
       @GetMapping("getAll")
       public DataResult<List<JobAdvert>> getAll(){
    	   return this.jobAdvertService.getAll();
       }
       @PostMapping("addAdvert")
       public Result add( JobAdvert jobAdvert) {
    	   return this.jobAdvertService.add(jobAdvert);
       }
       @PostMapping("activateAdvert")
       public Result activateAdver(int id) {
    	   return this.jobAdvertService.activateJobAdvert(id);
       }
       @PostMapping("deactivateAdvert")
       public Result deactivateAdvert(int id) {
    	   return this.jobAdvertService.deactivateJobAdvert(id);
       }
}
