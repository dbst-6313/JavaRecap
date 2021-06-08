package hrms.recap.business.abstracts;

import java.util.List;

import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.Result;

import hrms.recap.entities.concretes.Link;

public interface LinkService {
	Result add(Link link);
	Result update(Link link);
	Result delete(int id);
	DataResult<List<Link>> getAll();
	DataResult<Link> getById(int id);	
	DataResult<List<Link>> getAllByJoBSeekerId(int id);
}
