package pl.edu.wszib.savingtheworld.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PodatnikDAO extends CrudRepository<Podatnik, String> {

    Optional<Podatnik> findByImieIgnoreCase(String imie);
    List<Podatnik> findAllByNazwiskoIgnoreCaseOrderByNazwisko (String nazwisko);


}