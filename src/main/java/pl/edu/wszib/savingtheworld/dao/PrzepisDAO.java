package pl.edu.wszib.savingtheworld.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.savingtheworld.Przepis;

@Repository
public interface PrzepisDAO extends CrudRepository<Przepis, Long> {

}
