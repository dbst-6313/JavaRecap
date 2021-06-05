package hrms.recap.business.abstracts;

import java.util.List;

import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.entities.concretes.Job;

public interface JobService {
       DataResult<List<Job>> getAll();
       Result add(Job job);
}
