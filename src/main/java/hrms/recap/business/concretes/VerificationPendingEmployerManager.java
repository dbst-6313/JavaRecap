package hrms.recap.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.recap.business.abstracts.EmployerService;
import hrms.recap.business.abstracts.VerificationPendingEmployerService;
import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.ErrorResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.core.utilities.results.SuccessDataResult;
import hrms.recap.core.utilities.results.SuccessResult;
import hrms.recap.dataAccess.abstracts.VerificationPendingEmployerDao;
import hrms.recap.entities.concretes.VerificationPendingEmployer;

@Service
public class VerificationPendingEmployerManager implements VerificationPendingEmployerService {

	@Autowired private VerificationPendingEmployerDao verificationPendingEmployerDao;
	@Autowired private EmployerService employerService;
	@Override
	public DataResult<List<VerificationPendingEmployer>> getAll() {
		return new SuccessDataResult<List<VerificationPendingEmployer>>(this.verificationPendingEmployerDao.findAll());
	}

	@Override
	public DataResult<VerificationPendingEmployer> getById(int id) {
		return new SuccessDataResult<VerificationPendingEmployer>(this.verificationPendingEmployerDao.getByUserId(id));
	}

	@Override
	public Result add(VerificationPendingEmployer verificationPendingEmployer) {
		
	 if(this.checkIfEmailEqualsWebSite(verificationPendingEmployer.getEmail(), verificationPendingEmployer.getWebAdress())) {
			return new ErrorResult("Email adresi domaini ile web adresi uyuşmuyor");
		}
		else if(this.checkPasswordConfirm(verificationPendingEmployer.getPassword(), verificationPendingEmployer.getPasswordCheck())) {
			return new ErrorResult("Şifreler uyuşmuyor");
		}
		this.verificationPendingEmployerDao.save(verificationPendingEmployer);
		return new SuccessResult("Onaylamayı beklenen güncelleme eklendi");
	}

	@Override
	public Result delete(VerificationPendingEmployer verificationPendingEmployer) {
		this.verificationPendingEmployerDao.delete(verificationPendingEmployer);
		return new SuccessResult("Silindi");
	}
	public boolean checkPasswordConfirm(String password,String passwordConfirm) {
		if(!password.equals(passwordConfirm)) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean checkIfEmailEqualsWebSite(String email,String website) {
		
		String emailDomain = email.substring(email.indexOf("@")+1);
		emailDomain = emailDomain.substring(0,emailDomain.indexOf("."));
		String websiteDomain = website.substring(0,website.indexOf("."));
		if(emailDomain.equals(websiteDomain)) {
			return false;
		}
		else {
			return true;
		}
	}


}
