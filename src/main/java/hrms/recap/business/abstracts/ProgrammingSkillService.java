package hrms.recap.business.abstracts;

import java.util.List;

import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.Result;

import hrms.recap.entities.concretes.ProgrammingSkill;

public interface ProgrammingSkillService {
	Result add(ProgrammingSkill programmingSkill);
	Result update(ProgrammingSkill programmingSkill);
	Result delete(int id);
	DataResult<List<ProgrammingSkill>> getAll();
	DataResult<ProgrammingSkill> getById(int id);	
	DataResult<List<ProgrammingSkill>> getAllByJoBSeekerId(int id);
}
