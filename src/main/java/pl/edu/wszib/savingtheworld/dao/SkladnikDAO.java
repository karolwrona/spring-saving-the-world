package pl.edu.wszib.savingtheworld.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.savingtheworld.Skladnik;

@Repository
public interface SkladnikDAO extends CrudRepository<Skladnik, Long> {

}
