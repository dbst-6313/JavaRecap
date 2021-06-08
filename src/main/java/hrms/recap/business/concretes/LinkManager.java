package hrms.recap.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.recap.business.abstracts.LinkService;
import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.core.utilities.results.SuccessDataResult;
import hrms.recap.core.utilities.results.SuccessResult;

import hrms.recap.dataAccess.abstracts.LinkDao;

import hrms.recap.entities.concretes.Link;

@Service
public class LinkManager implements LinkService{

	 private LinkDao linkDao;
	@Autowired
	public LinkManager(LinkDao linkDao) {
		super();
		this.linkDao = linkDao;
	}
	@Override
	public Result add(Link link) {
		this.linkDao.save(link);
		return new SuccessResult("Linkleriniz eklendi");
	}

	@Override
	public Result update(Link link) {
		this.linkDao.save(link);
		return new SuccessResult("Linkleriniz güncellendi");
	}

	@Override
	public Result delete(int id) {
		this.linkDao.deleteById(id);
		return new SuccessResult("Linkleriniz silindi");
	}

	@Override
	public DataResult<List<Link>> getAll() {
		return new SuccessDataResult<List<Link>>(this.linkDao.findAll());
	}

	@Override
	public DataResult<Link> getById(int id) {
		return new SuccessDataResult<Link>(this.linkDao.getById(id));
	}

	@Override
	public DataResult<List<Link>> getAllByJoBSeekerId(int id) {
		return new SuccessDataResult<List<Link>>(this.linkDao.getAllByjobseeker_userId(id));
	}

}
