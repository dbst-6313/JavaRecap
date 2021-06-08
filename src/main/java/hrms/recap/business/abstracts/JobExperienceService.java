package hrms.recap.business.abstracts;

import java.util.List;

import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.entities.concretes.JobExperience;


public interface JobExperienceService {
	Result add(JobExperience jobExperience);
	Result update(JobExperience jobExperience);
	Result delete(int id);
	DataResult<List<JobExperience>> getAll();
	DataResult<JobExperience> getById(int id);	
	DataResult<List<JobExperience>> getAllByJoBSeekerId(int id);
}
