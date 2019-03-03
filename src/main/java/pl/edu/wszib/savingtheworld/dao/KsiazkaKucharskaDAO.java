package pl.edu.wszib.savingtheworld.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.savingtheworld.KsiazkaKucharska;

@Repository
public interface KsiazkaKucharskaDAO extends CrudRepository<KsiazkaKucharska, Long> {

}
