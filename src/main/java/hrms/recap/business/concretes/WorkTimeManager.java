package hrms.recap.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.recap.business.abstracts.WorkTimeService;
import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.SuccessDataResult;
import hrms.recap.dataAccess.abstracts.WorkTimeDao;
import hrms.recap.entities.concretes.WorkTime;

@Service
public class WorkTimeManager implements WorkTimeService{
	@Autowired
	private WorkTimeDao workTimeDao;
	@Override
	public DataResult<List<WorkTime>> getAll() {
		return new SuccessDataResult<List<WorkTime>>(this.workTimeDao.findAll());
	}
}
