package hrms.recap.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import hrms.recap.entities.concretes.Link;

public interface LinkDao extends JpaRepository<Link, Integer>{
	Link getById(int id);
	List<Link> getAllByjobseeker_userId(int id);
}
