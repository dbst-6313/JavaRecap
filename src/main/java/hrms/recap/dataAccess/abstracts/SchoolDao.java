package hrms.recap.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.recap.entities.concretes.School;

public interface SchoolDao extends JpaRepository<School,Integer> {
	School getById(int id);
	List<School> getAllByjobseeker_userId(int id);
}
