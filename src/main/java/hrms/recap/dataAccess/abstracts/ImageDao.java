package hrms.recap.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import hrms.recap.entities.concretes.Image;

public interface ImageDao  extends JpaRepository<Image, Integer>{
	Image getById(int id);
	List<Image> getAllByjobseeker_userId(int id);
}
