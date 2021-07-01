package hrms.recap.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.recap.entities.concretes.VerificationPendingEmployer;

public interface VerificationPendingEmployerDao extends JpaRepository<VerificationPendingEmployer,Integer>{
                 VerificationPendingEmployer getByUserId(int userId);
}
