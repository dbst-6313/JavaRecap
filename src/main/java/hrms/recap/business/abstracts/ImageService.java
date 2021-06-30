package hrms.recap.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.entities.concretes.Image;

public interface ImageService {
	Result add(Image image, MultipartFile imageFile);
	Result update(Image image,MultipartFile imageFile);
	Result delete(int id);
	DataResult<List<Image>> getAll();
	DataResult<Image> getById(int id);	
	DataResult<List<Image>> getAllByJoBSeekerId(int id);
}
