package hrms.recap.business.abstracts;

import java.util.List;

import hrms.recap.core.utilities.results.DataResult;
import hrms.recap.core.utilities.results.Result;
import hrms.recap.entities.concretes.Favorite;

public interface FavoriteService {
       Result add(Favorite favorite);
       Result delete(Favorite favorite);
       DataResult<List<Favorite>> getAllFavoritesByUserId(int userId);
       DataResult<List<Favorite>> getAllFavorites();
}
