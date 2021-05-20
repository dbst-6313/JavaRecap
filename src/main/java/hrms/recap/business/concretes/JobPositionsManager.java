package hrms.recap.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.recap.business.abstracts.JobPositionsService;
import hrms.recap.dataAccess.abstracts.JobPositionsDao;
import hrms.recap.entities.concretes.JobPositions;

@Service
public class JobPositionsManager implements JobPositionsService{

	
	private JobPositionsDao jobPositionsDao;
	@Autowired
	public JobPositionsManager(JobPositionsDao jobPositionsDao) {
		super();
		this.jobPositionsDao = jobPositionsDao;
	}
	@Override
	public List<JobPositions> getAll() {
	
		return jobPositionsDao.findAll();
	}

}
