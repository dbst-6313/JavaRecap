package hrms.recap.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.recap.entities.concretes.Employer;

public interface EmployerDao  extends JpaRepository<Employer, Integer>{
	boolean existsEmployerByEmail(String email);
	Employer getByUserId(int userId);
}

