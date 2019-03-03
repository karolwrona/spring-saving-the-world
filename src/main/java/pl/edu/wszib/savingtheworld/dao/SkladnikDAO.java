package pl.edu.wszib.savingtheworld.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.savingtheworld.Skladnik;

import java.util.List;

@Repository
public interface SkladnikDAO extends CrudRepository<Skladnik, Long> {
    List<Skladnik> findAll();
}
