package hrms.recap.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hrms.recap.business.abstracts.JobSeekersService;
import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.ErrorResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.core.utilities.results.SuccessDataResult;
import hrms.recap.core.utilities.results.SuccessResult;
import hrms.recap.dataAccess.abstracts.JobSeekersDao;
import hrms.recap.entities.concretes.JobSeeker;

@Service
public class JobSeekersManager implements JobSeekersService{
	@Autowired
	private JobSeekersDao jobSeekersDao;
	@Override
	public DataResult<List<JobSeeker>> getAll() {
		
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekersDao.findAll(),"Listelendi");
	}

	@Override
	public Result add(JobSeeker jobSeeker) {

		this.jobSeekersDao.save(jobSeeker);
		    	return new SuccessResult("Eklendi");

	}
    
	
}
