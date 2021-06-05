package hrms.recap.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.recap.entities.concretes.JobAdvert;

public interface JobAdvertDao extends JpaRepository<JobAdvert,Integer>{
       List<JobAdvert> findByIsActiveTrue();
       List<JobAdvert> findByIsActiveTrueOrderByReleaseDateAsc();
       List<JobAdvert> findByIsActiveTrueAndEmployerUserId(int id);
}
