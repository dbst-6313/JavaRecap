package hrms.recap.business.abstracts;

import java.util.List;

import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.entities.concretes.Language;


public interface LanguageService {
	Result add(Language language);
	Result update(Language language);
	Result delete(int id);
	DataResult<List<Language>> getAll();
	DataResult<Language> getById(int id);	
	DataResult<List<Language>> getAllByJoBSeekerId(int id);
}
