package hrms.recap.core.utilities.Cloudinary;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import hrms.recap.core.utilities.results.DataResult;

public interface ImageUploadService {
	DataResult<Map> uploadImageFile(MultipartFile imageFile);
}
