package hrms.recap.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.recap.business.abstracts.JobTitleService;
import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.ErrorResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.core.utilities.results.SuccessDataResult;
import hrms.recap.core.utilities.results.SuccessResult;
import hrms.recap.dataAccess.abstracts.JobTitleDao;
import hrms.recap.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService{
       @Autowired
	   private JobTitleDao jobTitleDao;

	@Override
	public DataResult<List<JobTitle>> getAll() {
		return new SuccessDataResult<List<JobTitle>>(this.jobTitleDao.findAll());
	}

	@Override
	public Result add(JobTitle jobTitle) {
		if(this.jobTitleDao.existsJobTitlesByTitle(jobTitle.getTitle())) {
			return new ErrorResult("Bölüm ismi zaten var");
		}
		this.jobTitleDao.save(jobTitle);
		return new SuccessResult("Bölüm ismi eklendi");
	}
}
