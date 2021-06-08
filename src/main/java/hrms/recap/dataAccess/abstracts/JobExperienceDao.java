package hrms.recap.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import hrms.recap.entities.concretes.JobExperience;
public interface JobExperienceDao  extends JpaRepository<JobExperience, Integer>{
	JobExperience getById(int id);
	List<JobExperience> getAllByjobseeker_userId(int id);
}
