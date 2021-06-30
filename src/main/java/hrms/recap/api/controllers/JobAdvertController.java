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

import hrms.recap.business.abstracts.JobAdvertService;
import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.entities.concretes.JobAdvert;


@RestController
@RequestMapping("/api/jobadvert/")
@CrossOrigin(origins="http://localhost:3000")
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
       @GetMapping("getbyid")
       public DataResult<JobAdvert> getById(int id){
    	   return this.jobAdvertService.getById(id);
       }
       @GetMapping("getByCityId")
       public DataResult<List<JobAdvert>> getByCityId(@RequestParam int id){
    	   return this.jobAdvertService.getByCityId(id);
       }
       @GetMapping("getByWorkTypeId")
       public DataResult<List<JobAdvert>> getByWorkTypeId(@RequestParam int id){
    	   return this.jobAdvertService.getByWorkTypeId(id);
       }
       @GetMapping("getByCityAndWorkTypeId")
       public DataResult<List<JobAdvert>> getByCityAndWorkTypeId(@RequestParam int cityId,@RequestParam int workTypeId){
    	   return this.jobAdvertService.getByCityAndWorkTypeId(cityId,workTypeId);
       }
       @GetMapping("getNotActiveAdverts")
       public DataResult<List<JobAdvert>> getNotActiveAdverts(){
    	   return this.jobAdvertService.getNotActiveJobAdverts();
       }
       @PostMapping("addAdvert")
       public Result add(@RequestBody JobAdvert jobAdvert) {
    	   return this.jobAdvertService.add(jobAdvert);
       }
       @PostMapping("deleteAdvert")
       public Result add(@RequestParam int id) {
    	   return this.jobAdvertService.deleteById(id);
       }
       @PostMapping("activateAdvert")
       public Result activateAdver(@RequestParam int id) {
    	   return this.jobAdvertService.activateJobAdvert(id);
       }
       @PostMapping("deactivateAdvert")
       public Result deactivateAdvert(@RequestParam int id) {
    	   return this.jobAdvertService.deactivateJobAdvert(id);
       }
 
}
