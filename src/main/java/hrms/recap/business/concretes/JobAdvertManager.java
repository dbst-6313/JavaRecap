package hrms.recap.business.concretes;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.recap.business.abstracts.JobAdvertService;
import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.core.utilities.results.SuccessDataResult;
import hrms.recap.core.utilities.results.SuccessResult;
import hrms.recap.dataAccess.abstracts.JobAdvertDao;
import hrms.recap.entities.concretes.JobAdvert;
import hrms.recap.entities.concretes.WorkType;

@Service
public class JobAdvertManager implements JobAdvertService{
    
	@Autowired
	private JobAdvertDao jobAdvertDao;
	@Override
	public DataResult<List<JobAdvert>> getActiveJobAdverts() {
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findByIsActiveTrue(),"Aktif iş ilanları listelendi");
	}

	@Override
	public DataResult<List<JobAdvert>> getActiveJobAdvertsSorted() {
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findByIsActiveTrueOrderByReleaseDateAsc(),"Aktif iş ilanları sıralı bir şekilde listelendi");
	}

	@Override
	public DataResult<List<JobAdvert>> getActiveJobAdvertsByEmployer(int id) {
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findByIsActiveTrueAndEmployerUserId(id),"Firmaya ait aktif iş ilanları listelendi");
	}
	public DataResult<List<JobAdvert>> getAll() {
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findAll(),"Tüm ilanlar listelendi");
	}

	@Override
	public Result add(JobAdvert jobAdvert) {
		var date = LocalDate.now();
		jobAdvert.setReleaseDate(date);
		this.jobAdvertDao.save(jobAdvert);
		return new SuccessResult("İş ilanı eklendi");
	}

	@Override
	public Result activateJobAdvert(int id) {
		JobAdvert jobAdvert = this.jobAdvertDao.findById(id).get();
		jobAdvert.setActive(true);
		this.jobAdvertDao.save(jobAdvert);
		return new SuccessResult("İş ilanı aktive edildi");
	}

	@Override
	public Result deactivateJobAdvert(int id) {
		JobAdvert jobAdvert = this.jobAdvertDao.findById(id).get();
		jobAdvert.setActive(false);
		this.jobAdvertDao.save(jobAdvert);
		return new SuccessResult("İş ilanı deaktive edildi");
	}

	@Override
	public DataResult<JobAdvert> getById(int id) {
		return new SuccessDataResult<JobAdvert>(this.jobAdvertDao.findById(id).get());
	}

	@Override
	public DataResult<List<JobAdvert>> getNotActiveJobAdverts() {
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findByIsActiveFalse(),"Aktif olmayan ilanlar listelendi");
	}



}
