package hrms.recap.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.recap.entities.concretes.JobTitle;


public interface JobTitleDao extends JpaRepository<JobTitle, Integer>{
       boolean existsJobTitlesByTitle(String title);
}
