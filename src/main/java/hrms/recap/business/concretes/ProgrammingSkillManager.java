package hrms.recap.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.recap.business.abstracts.ProgrammingSkillService;
import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.core.utilities.results.SuccessDataResult;
import hrms.recap.core.utilities.results.SuccessResult;
import hrms.recap.dataAccess.abstracts.ProgrammingSkillDao;

import hrms.recap.entities.concretes.ProgrammingSkill;

@Service
public class ProgrammingSkillManager implements ProgrammingSkillService{
	
	private ProgrammingSkillDao programmingSkillDao;
	@Autowired
	public ProgrammingSkillManager(ProgrammingSkillDao programmingSkillDao) {
		super();
		this.programmingSkillDao = programmingSkillDao;
	}
	@Override
	public Result add(ProgrammingSkill programmingSkill) {
		this.programmingSkillDao.save(programmingSkill);
		return new SuccessResult("Linkleriniz eklendi");
	}

	@Override
	public Result update(ProgrammingSkill programmingSkill) {
		this.programmingSkillDao.save(programmingSkill);
		return new SuccessResult("Linkleriniz güncellendi");
	}

	@Override
	public Result delete(int id) {
		this.programmingSkillDao.deleteById(id);
		return new SuccessResult("Linkleriniz silindi");
	}

	@Override
	public DataResult<List<ProgrammingSkill>> getAll() {
		return new SuccessDataResult<List<ProgrammingSkill>>(this.programmingSkillDao.findAll());
	}

	@Override
	public DataResult<ProgrammingSkill> getById(int id) {
		return new SuccessDataResult<ProgrammingSkill>(this.programmingSkillDao.getById(id));
	}

	@Override
	public DataResult<List<ProgrammingSkill>> getAllByJoBSeekerId(int id) {
		return new SuccessDataResult<List<ProgrammingSkill>>(this.programmingSkillDao.getAllByjobseeker_userId(id));
	}

}
