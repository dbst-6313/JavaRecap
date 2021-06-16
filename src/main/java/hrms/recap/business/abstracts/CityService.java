package hrms.recap.business.abstracts;

import java.util.List;

import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.entities.concretes.City;

public interface CityService {

	DataResult<List<City>> getAll();
}
