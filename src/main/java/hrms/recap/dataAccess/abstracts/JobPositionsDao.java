package hrms.recap.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import hrms.recap.entities.concretes.JobPositions;

public interface JobPositionsDao extends JpaRepository<JobPositions,Integer>{

}
