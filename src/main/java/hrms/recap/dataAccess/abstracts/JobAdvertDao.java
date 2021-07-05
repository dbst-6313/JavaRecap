package hrms.recap.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import hrms.recap.entities.concretes.JobAdvert;

public interface JobAdvertDao extends JpaRepository<JobAdvert,Integer>{
       List<JobAdvert> findByIsActiveTrue(Pageable pageable);
       List<JobAdvert> findByIsActiveFalse();

       List<JobAdvert> findByWorkTypeId(int workTypeId);
       List<JobAdvert> findByCityId(int cityId);
       List<JobAdvert> findByCityIdAndWorkTypeId(int cityId,int workTypeId);
       List<JobAdvert> findByIsActiveTrueOrderByReleaseDateAsc();
       List<JobAdvert> findByIsActiveTrueAndEmployerUserId(int id);
}
