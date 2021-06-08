package hrms.recap.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.recap.business.abstracts.CvCoverLetterService;
import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.core.utilities.results.SuccessDataResult;
import hrms.recap.core.utilities.results.SuccessResult;
import hrms.recap.dataAccess.abstracts.CvCoverLetterDao;
import hrms.recap.entities.concretes.CvCoverLetter;

@Service
public class CvCoverLetterManager implements CvCoverLetterService{
	
	private CvCoverLetterDao cvCoverLetterDao;
	@Autowired
	public CvCoverLetterManager(CvCoverLetterDao cvCoverLetterDao) {
		super();
		this.cvCoverLetterDao = cvCoverLetterDao;
	}
	@Override
	public Result add(CvCoverLetter cvCoverLetter) {
		this.cvCoverLetterDao.save(cvCoverLetter);
		return new SuccessResult("Ön yazı eklendi");
	}

	@Override
	public Result update(CvCoverLetter cvCoverLetter) {
		this.cvCoverLetterDao.save(cvCoverLetter);
		return new SuccessResult("Ön yazı güncellendi");
	}

	@Override
	public Result delete(int id) {
		this.cvCoverLetterDao.deleteById(id);
		return new SuccessResult("Ön yazı silindi");
	}

	@Override
	public DataResult<List<CvCoverLetter>> getAll() {
		return new SuccessDataResult<List<CvCoverLetter>>(this.cvCoverLetterDao.findAll());
	}

	@Override
	public DataResult<CvCoverLetter> getById(int id) {
		return new SuccessDataResult<CvCoverLetter>(this.cvCoverLetterDao.getById(id));
	}

	@Override
	public DataResult<List<CvCoverLetter>> getAllByJoBSeekerId(int id) {
		return new SuccessDataResult<List<CvCoverLetter>>(this.cvCoverLetterDao.getAllByjobseeker_userId(id));
	}

}
