package hrms.recap.business.abstracts;

import java.util.List;

import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.entities.concretes.JobAdvert;
import hrms.recap.entities.concretes.WorkType;

public interface JobAdvertService {
       DataResult<List<JobAdvert>> getActiveJobAdverts();
       DataResult<List<JobAdvert>> getNotActiveJobAdverts();
       DataResult<List<JobAdvert>> getActiveJobAdvertsSorted();
       DataResult<List<JobAdvert>> getActiveJobAdvertsByEmployer(int id);
       DataResult<JobAdvert> getById(int id);
       DataResult<List<JobAdvert>> getAll();
       Result add(JobAdvert jobAdvert);
       Result activateJobAdvert(int id);
       Result deactivateJobAdvert(int id);
}
