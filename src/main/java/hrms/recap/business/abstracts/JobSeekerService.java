package hrms.recap.business.abstracts;

import java.util.List;

import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.entities.concretes.JobSeeker;
import hrms.recap.entities.dtos.CvDto;


public interface JobSeekerService {
     DataResult<List<JobSeeker>> getAll();
     Result add(JobSeeker jobSeeker);
     Result update(JobSeeker jobSeeker);
     DataResult<JobSeeker> getById(int id);
     DataResult<CvDto> getCvByJobSeekerId(int id);
}
