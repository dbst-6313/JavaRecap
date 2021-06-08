package hrms.recap.business.concretes;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import hrms.recap.business.abstracts.ImageService;
import hrms.recap.core.utilities.Cloudinary.ImageUploadService;
import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.core.utilities.results.SuccessDataResult;
import hrms.recap.core.utilities.results.SuccessResult;
import hrms.recap.dataAccess.abstracts.CvCoverLetterDao;
import hrms.recap.dataAccess.abstracts.ImageDao;
import hrms.recap.entities.concretes.Image;


@Service
public class ImageManager implements ImageService{
	
	 private ImageDao imageDao;
	 
	 private ImageUploadService imageService;
	 
	 @Autowired
		public ImageManager(ImageDao imageDao,ImageUploadService imageService) {
			super();
			this.imageDao = imageDao;
			this.imageService = imageService;
		}
	@Override
	public Result add(Image image,MultipartFile imageFile) {
		Map<String,String> uploadImage = this.imageService.uploadImageFile(imageFile).getData();
		image.setUrl(uploadImage.get("url"));
		this.imageDao.save(image);
		return new SuccessResult("Fotoğraf eklendi!");
	}

	@Override
	public Result update(Image image) {
		this.imageDao.save(image);
		return new SuccessResult("Fotoğraf güncellendi");
	}

	@Override
	public Result delete(int id) {
		this.imageDao.deleteById(id);
		return new SuccessResult("Fotoğraf silindi");
	}

	@Override
	public DataResult<List<Image>> getAll() {
		return new SuccessDataResult<List<Image>>(this.imageDao.findAll());
	}

	@Override
	public DataResult<Image> getById(int id) {
		return new SuccessDataResult<Image>(this.imageDao.getById(id));
	}

	@Override
	public DataResult<List<Image>> getAllByJoBSeekerId(int id) {
		return new SuccessDataResult<List<Image>>(this.imageDao.getAllByjobseeker_userId(id));
	}
}
