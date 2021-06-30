package hrms.recap.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.recap.business.abstracts.CvCoverLetterService;
import hrms.recap.business.abstracts.ImageService;
import hrms.recap.business.abstracts.JobExperienceService;
import hrms.recap.business.abstracts.JobSeekerService;
import hrms.recap.business.abstracts.LanguageService;
import hrms.recap.business.abstracts.LinkService;
import hrms.recap.business.abstracts.ProgrammingSkillService;
import hrms.recap.business.abstracts.SchoolService;
import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.ErrorResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.core.utilities.results.SuccessDataResult;
import hrms.recap.core.utilities.results.SuccessResult;
import hrms.recap.dataAccess.abstracts.JobSeekerDao;
import hrms.recap.entities.concretes.JobSeeker;
import hrms.recap.entities.dtos.CvDto;


@Service
public class JobSeekerManager implements JobSeekerService{
	
	@Autowired private JobSeekerDao jobSeekerDao;
	@Autowired private CvCoverLetterService cvCoverLetterManager;
	@Autowired private ImageService imageManager;
	@Autowired private JobExperienceService jobExperienceManager;
	@Autowired private LanguageService languageManager;
	@Autowired private LinkService linkManager;
	@Autowired private ProgrammingSkillService programmingSkillManager;
	@Autowired private SchoolService schoolManager;


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

	@Override
	public Result update(JobSeeker jobSeeker) {
		this.jobSeekerDao.save(jobSeeker);
		return new SuccessResult("İş arayan güncellendi");
	}

	@Override
	public DataResult<CvDto> getCvByJobSeekerId(int id) {
	        CvDto cv = new CvDto();
	        cv.setJobSeeker(this.jobSeekerDao.findById(id).get());
	        cv.setCvCoverLetters(this.cvCoverLetterManager.getAllByJoBSeekerId(id).getData());
	        cv.setImages(this.imageManager.getAllByJoBSeekerId(id).getData());
	        cv.setJobExperiences(this.jobExperienceManager.getAllByJoBSeekerId(id).getData());
	        cv.setLanguages(this.languageManager.getAllByJoBSeekerId(id).getData());
	        cv.setLinks(this.linkManager.getAllByJoBSeekerId(id).getData());
	        cv.setProgrammingSkills(this.programmingSkillManager.getAllByJoBSeekerId(id).getData());
	        cv.setSchools(this.schoolManager.getAllByJoBSeekerId(id).getData());
	        return new SuccessDataResult<CvDto>(cv,"Cv listelendi");
	}

	


}
