package hrms.recap.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.recap.entities.concretes.JobSeeker;

public interface JobSeekersDao extends JpaRepository<JobSeeker,Integer>{
  
}
