/*
package pl.edu.wszib.savingtheworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.edu.wszib.savingtheworld.dao.KsiazkaKucharskaDAO;
import pl.edu.wszib.savingtheworld.dao.PrzepisDAO;
import pl.edu.wszib.savingtheworld.dao.SkladnikDAO;
import pl.edu.wszib.savingtheworld.dao.TypSkladnikaDAO;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

@Component
public class CookBookInitComponent {
    @Autowired
    TypSkladnikaDAO typSkladnikaDAO;
    @Autowired
    SkladnikDAO skladnikDAO;
    @Autowired
    PrzepisDAO przepisDAO;
    @Autowired
    KsiazkaKucharskaDAO ksiazkaKucharskaDAO;

    @PostConstruct
    public void init() {

       */
/* for (int i = 0; i < 10; i++) {
            TypSkladnika typSkladnika = new TypSkladnika();
            typSkladnika.setNazwa("skladnik"+i);
            typSkladnikaDAO.save(typSkladnika);
        }

        KsiazkaKucharska ksiazkaKucharska = new KsiazkaKucharska();
        ksiazkaKucharska.setTytul("KuxharzP");
        ksiazkaKucharska = ksiazkaKucharskaDAO.save(ksiazkaKucharska);

        Przepis przepis = new Przepis();
        przepis.setKsiazkaKucharska(ksiazkaKucharska);
        przepis.setTytul("Grochowa");
        przepis = przepisDAO.save(przepis);

        List<TypSkladnika> typySkladnikow = typSkladnikaDAO.findAll();
        for(TypSkladnika typ : typySkladnikow) {
            Skladnik skladnik = new Skladnik();
            skladnik.setIlosc(new Random().nextInt(5)+1);
            skladnik.setTypSkladnika(typ);
            skladnik.setPrzepis(przepis);
            skladnikDAO.save(skladnik);*//*

        //}
        System.out.printf("");
    }
}
*/
