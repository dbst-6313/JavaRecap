package hrms.recap.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.recap.business.abstracts.FavoriteService;
import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.ErrorResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.core.utilities.results.SuccessDataResult;
import hrms.recap.core.utilities.results.SuccessResult;
import hrms.recap.dataAccess.abstracts.FavoriteDao;
import hrms.recap.entities.concretes.Favorite;

@Service
public class FavoriteManager implements FavoriteService {
       @Autowired private FavoriteDao favoriteDao;

	@Override
	public Result add(Favorite favorite) {
		if(this.favoriteDao.existsFavoriteByJobAdvertId(favorite.getJobAdvert().getId())) {
			return new ErrorResult("Bu ilanı daha önceden favoriye eklemişsiniz");
		}
		this.favoriteDao.save(favorite);
		return new SuccessResult("Favorilere eklendi");
	}

	@Override
	public Result delete(Favorite favorite) {
		this.favoriteDao.delete(favorite);
		return new SuccessResult("Favorilerden silindi");
	}

	

	@Override
	public DataResult<List<Favorite>> getAllFavoritesByUserId(int userId) {
		return new SuccessDataResult<List<Favorite>>(this.favoriteDao.getAllFavoriteByJobSeekerUserId(userId));
	}

	@Override
	public DataResult<List<Favorite>> getAllFavorites() {
		return new SuccessDataResult<List<Favorite>>(this.favoriteDao.findAll());
	}
}
