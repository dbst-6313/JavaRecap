package hrms.recap.business.abstracts;

import java.util.List;

import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.entities.concretes.JobTitle;

public interface JobTitleService {
       DataResult<List<JobTitle>> getAll();
       Result add(JobTitle jobTitle);
}
