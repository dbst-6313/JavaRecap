package hrms.recap.business.abstracts;

import java.util.List;

import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.entities.concretes.VerificationPendingEmployer;

public interface VerificationPendingEmployerService {
       DataResult<List<VerificationPendingEmployer>> getAll();
       DataResult<VerificationPendingEmployer> getById(int id);
       Result add(VerificationPendingEmployer verificationPendingEmployer);
       Result delete(VerificationPendingEmployer verificationPendingEmployer);
}
