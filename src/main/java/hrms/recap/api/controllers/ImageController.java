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
import org.springframework.web.multipart.MultipartFile;

import hrms.recap.business.abstracts.CvCoverLetterService;
import hrms.recap.business.abstracts.ImageService;
import hrms.recap.business.abstracts.JobSeekerService;
import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.entities.concretes.Image;
import hrms.recap.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/image/")
@CrossOrigin(origins="http://localhost:3000")
public class ImageController {

 private ImageService imageService;

 private JobSeekerService jobSeekerService;
	
	@Autowired
	public ImageController(ImageService imageService,JobSeekerService jobSeekerService) {
		super();
		this.imageService = imageService;
		this.jobSeekerService = jobSeekerService;
	}


	@PostMapping(value = "add")
	public Result add(@RequestParam(value = "id")int id, @RequestParam(value = "imageFile") MultipartFile imageFile){
		JobSeeker jobSeeker = this.jobSeekerService.getById(id).getData();
		Image image = new Image();
		image.setJobseeker(jobSeeker);
		return this.imageService.add(image, imageFile);
	}


	@PostMapping(value = "update")
	public Result update(@RequestParam(value = "id")int id,@RequestParam(value="imageFile") MultipartFile imageFile){
		Image image = this.imageService.getById(id).getData();
		return this.imageService.add(image, imageFile);
	}
	
	@PostMapping("delete")
	public Result delete( @RequestParam int  id){
		return this.imageService.delete(id);
		
	}
	
	@GetMapping("getall")
	public DataResult<List<Image>> getAll(){
		return this.imageService.getAll();
	}
	
	@GetMapping("getAllByJobSeekerId")
	public DataResult<List<Image>> getAllByJobSeekerId(@RequestParam int id){
		return this.imageService.getAllByJoBSeekerId(id);
	}
	@GetMapping("getById")
	public DataResult<Image> getById(@RequestParam int id){
		return this.imageService.getById(id);
	}
}
