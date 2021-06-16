package hrms.recap.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.recap.business.abstracts.CityService;
import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.SuccessDataResult;
import hrms.recap.dataAccess.abstracts.CityDao;
import hrms.recap.entities.concretes.City;

@Service
public class CityManager implements CityService {
    
	@Autowired
	private CityDao cityDao;
	
	@Override
	public DataResult<List<City>> getAll() {
		return new SuccessDataResult<List<City>>(this.cityDao.findAll());
	}

}
