package hrms.recap.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.recap.business.abstracts.JobService;
import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.ErrorResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.core.utilities.results.SuccessDataResult;
import hrms.recap.core.utilities.results.SuccessResult;
import hrms.recap.dataAccess.abstracts.JobDao;
import hrms.recap.entities.concretes.Job;

@Service
public class JobManager implements JobService{
       @Autowired
	   private JobDao jobDao;

	@Override
	public DataResult<List<Job>> getAll() {
		return new SuccessDataResult<List<Job>>(this.jobDao.findAll());
	}

	@Override
	public Result add(Job job) {
		if(this.jobDao.existsJobByTitle(job.getTitle())) {
			return new ErrorResult("Bölüm ismi zaten var");
		}
		this.jobDao.save(job);
		return new SuccessResult("Bölüm ismi eklendi");
	}
}
