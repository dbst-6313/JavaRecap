package hrms.recap.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.recap.business.abstracts.LanguageService;
import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.core.utilities.results.SuccessDataResult;
import hrms.recap.core.utilities.results.SuccessResult;

import hrms.recap.dataAccess.abstracts.LanguageDao;

import hrms.recap.entities.concretes.Language;


@Service
public class LanguageManager implements LanguageService{
	
	 private LanguageDao languageDao;
	@Autowired
	public LanguageManager(LanguageDao languageDao) {
		super();
		this.languageDao = languageDao;
	}
	@Override
	public Result add(Language language) {
		this.languageDao.save(language);
		return new SuccessResult("Dil seviyeniz eklendi");
	}

	@Override
	public Result update(Language link) {
		this.languageDao.save(link);
		return new SuccessResult("Dil seviyeniz  güncellendi");
	}

	@Override
	public Result delete(int id) {
		this.languageDao.deleteById(id);
		return new SuccessResult("Dil seviyeniz  silindi");
	}

	@Override
	public DataResult<List<Language>> getAll() {
		return new SuccessDataResult<List<Language>>(this.languageDao.findAll());
	}

	@Override
	public DataResult<Language> getById(int id) {
		return new SuccessDataResult<Language>(this.languageDao.getById(id));
	}

	@Override
	public DataResult<List<Language>> getAllByJoBSeekerId(int id) {
		return new SuccessDataResult<List<Language>>(this.languageDao.getAllByjobseeker_userId(id));
	}

}
