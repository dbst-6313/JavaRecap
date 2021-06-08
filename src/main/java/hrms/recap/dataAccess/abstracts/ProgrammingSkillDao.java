package hrms.recap.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.recap.entities.concretes.ProgrammingSkill;

public interface ProgrammingSkillDao extends JpaRepository<ProgrammingSkill,Integer>{
	ProgrammingSkill getById(int id);
	List<ProgrammingSkill> getAllByjobseeker_userId(int id);
}
