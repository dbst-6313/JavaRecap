package hrms.recap.business.abstracts;

import java.util.List;

import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.entities.concretes.JobPositions;


public interface JobPositionsService {
       DataResult<List<JobPositions>> getAll();
}
