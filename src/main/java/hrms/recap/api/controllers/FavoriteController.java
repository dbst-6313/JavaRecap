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

import hrms.recap.business.abstracts.FavoriteService;
import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.entities.concretes.Favorite;

@RequestMapping("/api/favorite/")
@RestController
@CrossOrigin(origins="http://localhost:3000")
public class FavoriteController {
	
       @Autowired FavoriteService favoriteService;
       
       @PostMapping("add")
       public Result add(@RequestBody Favorite favorite) {
    	   return this.favoriteService.add(favorite);
       }
       
       @PostMapping("delete")
       public Result delete(@RequestBody Favorite favorite) {
    	   return this.favoriteService.delete(favorite);
       }
       @GetMapping("getByUserId")
       public DataResult<List<Favorite>> getByUserId(@RequestParam int userId){
    	   return this.favoriteService.getAllFavoritesByUserId(userId);
       }
       
       @GetMapping("getAll")
       public DataResult<List<Favorite>> getAll(){
    	   return this.favoriteService.getAllFavorites();
       }
}
