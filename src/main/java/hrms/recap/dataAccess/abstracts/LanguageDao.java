package hrms.recap.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.recap.entities.concretes.Language;



public interface LanguageDao extends JpaRepository<Language,Integer>{
	Language getById(int id);
	List<Language> getAllByjobseeker_userId(int id);
}
