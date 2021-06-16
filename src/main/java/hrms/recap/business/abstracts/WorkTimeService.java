package hrms.recap.business.abstracts;

import java.util.List;

import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.entities.concretes.WorkTime;

public interface WorkTimeService {
       DataResult<List<WorkTime>> getAll();
}
