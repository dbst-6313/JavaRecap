package hrms.recap.core.utilities.Cloudinary;

import java.io.IOException;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.ErrorDataResult;
import hrms.recap.core.utilities.results.SuccessDataResult;

@Service
public class ImageUploadManager implements ImageUploadService{

private Cloudinary cloudinary;
    public ImageUploadManager() {
    	this.cloudinary = new Cloudinary(ObjectUtils.asMap(
				"cloud_name","dkmri0uxe",
				"api_key", "316934717932439",
				"api_secret","reiQtg3zI_buIEjktUqR6mUJEwE"));
    }
    @Override
	public DataResult<Map> uploadImageFile(MultipartFile imageFile) {
		try {
			@SuppressWarnings("unchecked")
			Map<String, String> resultMap =(Map<String, String>) cloudinary.uploader().upload(imageFile.getBytes(), ObjectUtils.emptyMap());
			return new SuccessDataResult<Map>(resultMap);
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		return new ErrorDataResult<Map>();
	}
}
