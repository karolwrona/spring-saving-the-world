package pl.edu.wszib.savingtheworld.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.savingtheworld.Skladnik;
import pl.edu.wszib.savingtheworld.TypSkladnika;

import java.util.List;

@Repository
public interface TypSkladnikaDAO extends CrudRepository<TypSkladnika, Long> {
    List<TypSkladnika> findAll();
}
