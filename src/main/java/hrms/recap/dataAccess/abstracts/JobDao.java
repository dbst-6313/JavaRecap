package hrms.recap.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.recap.entities.concretes.Job;


public interface JobDao extends JpaRepository<Job, Integer>{
       boolean existsJobByTitle(String title);
}
