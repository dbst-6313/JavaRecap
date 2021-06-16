package hrms.recap.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import hrms.recap.entities.concretes.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer> {
       boolean existsJobSeekerByEmail(String email);
       boolean existsJobSeekerByIdentityNumber(String identityNumber);
       JobSeeker getByUserId(int id);
       
     
} 