package hrms.recap.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.recap.entities.concretes.Favorite;

public interface FavoriteDao extends JpaRepository<Favorite,Integer>{
       List<Favorite> getAllFavoriteByJobSeekerUserId(int userId);
       boolean existsFavoriteByJobAdvertId(int jobAdvertId);
}
