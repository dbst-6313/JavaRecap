package hrms.recap.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.recap.business.abstracts.EmployerService;
import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.ErrorResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.core.utilities.results.SuccessDataResult;
import hrms.recap.core.utilities.results.SuccessResult;
import hrms.recap.dataAccess.abstracts.EmployerDao;
import hrms.recap.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {
    
	@Autowired
	private EmployerDao employerDao;
	
	@Override
	public DataResult<List<Employer>> getAll() {
	       
		   return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"Listelendi");
	}

	@Override
	public Result add(Employer employer) {
		if(this.employerDao.existsEmployerByEmail(employer.getEmail())) {
			return new ErrorResult("Email adresi zaten kayıtlı");
		}
		else if(this.checkIfEmailEqualsWebSite(employer.getEmail(), employer.getWebAdress())) {
			return new ErrorResult("Email adresi domaini ile web adresi uyuşmuyor");
		}
		else if(this.checkPasswordConfirm(employer.getPassword(), employer.getPasswordCheck())) {
			return new ErrorResult("Şifreler uyuşmuyor");
		}
		this.employerDao.save(employer);
		return new SuccessResult("İş veren veritabanına eklendi");
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
