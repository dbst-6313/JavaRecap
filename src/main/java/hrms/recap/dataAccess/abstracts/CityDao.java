package hrms.recap.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.recap.entities.concretes.City;

public interface CityDao extends JpaRepository<City,Integer> {

}
