package hrms.recap.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.recap.business.abstracts.JobSeekerService;
import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.ErrorResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.core.utilities.results.SuccessDataResult;
import hrms.recap.core.utilities.results.SuccessResult;
import hrms.recap.dataAccess.abstracts.JobSeekerDao;
import hrms.recap.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService{
	@Autowired
   private JobSeekerDao jobSeekerDao;

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(),"Listelendi");
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		if(this.jobSeekerDao.existsJobSeekerByEmail(jobSeeker.getEmail())){
			return new ErrorResult("Email zaten kullanımda");
		}
		else if(this.jobSeekerDao.existsJobSeekerByIdentityNumber(jobSeeker.getIdentityNumber())) {
			return new ErrorResult("Kimlik numarası zaten kayıtlı");
		}
	
		this.jobSeekerDao.save(jobSeeker);
		return new SuccessResult("İş arayan kişi veri tabanına eklendi");
	}

	@Override
	public DataResult<JobSeeker> getById(int id) {
		return new SuccessDataResult<JobSeeker>(this.jobSeekerDao.getByUserId(id));
	}
}
