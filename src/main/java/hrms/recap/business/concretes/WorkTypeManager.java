package hrms.recap.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.recap.business.abstracts.WorkTypeService;
import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.SuccessDataResult;
import hrms.recap.dataAccess.abstracts.WorkTypeDao;
import hrms.recap.entities.concretes.WorkType;

@Service
public class WorkTypeManager implements WorkTypeService{

	@Autowired
	private WorkTypeDao workTypeDao;
	@Override
	public DataResult<List<WorkType>> getAll() {
		return new SuccessDataResult<List<WorkType>>(this.workTypeDao.findAll());
	}

}
