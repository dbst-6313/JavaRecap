package hrms.recap.business.abstracts;

import java.util.List;

import hrms.recap.entities.concretes.JobPositions;


public interface JobPositionsService {
       List<JobPositions> getAll();
}
