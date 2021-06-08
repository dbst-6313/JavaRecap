package hrms.recap.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import hrms.recap.business.abstracts.LinkService;
import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.entities.concretes.Link;

@RestController
@RequestMapping("/api/link/")
public class LinkController {
		private LinkService linkService;
	
	
	@Autowired
	public LinkController(LinkService linkService) {
		super();
		this.linkService = linkService;
	}

	@PostMapping("add")
	public Result add(@RequestBody Link link){
		return this.linkService.add(link);
		
	}
	
	@PostMapping("update")
	public Result update(@RequestBody Link link){
		return this.linkService.update(link);
		
	}
	
	@PostMapping("delete")
	public Result delete(@RequestParam int id){
		return this.linkService.delete(id);
		
	}
	
	@GetMapping("getall")
	public DataResult<List<Link>> getAll(){
		return this.linkService.getAll();
	}
	
	@GetMapping("getAllByJobSeekerId")
	public DataResult<List<Link>> getAllByJobSeekerId(int id){
		return this.linkService.getAllByJoBSeekerId(id);
	}
	@GetMapping("getById")
	public DataResult<Link> getById(int id){
		return this.linkService.getById(id);
	}

}
