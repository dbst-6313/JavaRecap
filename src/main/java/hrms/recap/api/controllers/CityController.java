package hrms.recap.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.recap.business.abstracts.CityService;
import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.entities.concretes.City;

@RestController
@RequestMapping("/api/city/")
@CrossOrigin(origins="http://localhost:3000")
public class CityController {

	@Autowired
	private CityService cityService;
	
	@GetMapping("getall")
	public DataResult<List<City>> getAll(){
		return this.cityService.getAll();
	}
}
