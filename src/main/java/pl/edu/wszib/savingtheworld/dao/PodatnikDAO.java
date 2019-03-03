package pl.edu.wszib.savingtheworld.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.savingtheworld.Faktura;
import pl.edu.wszib.savingtheworld.Podatnik;

import java.util.List;
import java.util.Optional;

@Repository
public interface PodatnikDAO extends CrudRepository<Podatnik, Long> {

    Optional<Podatnik> findByImieIgnoreCase(String imie);
    List<Podatnik> findAllByNazwiskoIgnoreCaseOrderByNazwisko(String nazwisko);
    List<Podatnik> findAllBy();
    List<Faktura> findAllByFaktury(Podatnik podatnik);
    List<Podatnik> findAllByFaktury_Tytul(String tytul);




}
