package hrms.recap.business.abstracts;

import java.util.List;

import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.entities.concretes.Employer;

public interface EmployerService {
	  DataResult<List<Employer>> getAll();
	  DataResult<Employer> getById(int id);
	   Result add(Employer employer);
	   Result update(Employer employer);
}
