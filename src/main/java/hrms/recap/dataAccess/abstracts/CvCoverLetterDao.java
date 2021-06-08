package hrms.recap.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.recap.entities.concretes.CvCoverLetter;


public interface CvCoverLetterDao extends JpaRepository<CvCoverLetter, Integer>{
	CvCoverLetter getById(int id);
	List<CvCoverLetter> getAllByjobseeker_userId(int id);
}
