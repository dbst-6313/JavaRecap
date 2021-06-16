package hrms.recap.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.recap.entities.concretes.WorkType;

public interface WorkTypeDao extends JpaRepository<WorkType,Integer> {

}
