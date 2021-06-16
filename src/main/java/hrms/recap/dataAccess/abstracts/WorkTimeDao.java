package hrms.recap.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.recap.entities.concretes.WorkTime;

public interface WorkTimeDao extends JpaRepository<WorkTime,Integer>  {

}
