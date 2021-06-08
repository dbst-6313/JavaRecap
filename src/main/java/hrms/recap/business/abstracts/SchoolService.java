package hrms.recap.business.abstracts;

import java.util.List;

import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.entities.concretes.School;

public interface SchoolService {
	Result add(School school);
	Result update(School school);
	Result delete(int id);
	DataResult<List<School>> getAll();
	DataResult<School> getById(int id);	
	DataResult<List<School>> getAllByJoBSeekerId(int id);
}
