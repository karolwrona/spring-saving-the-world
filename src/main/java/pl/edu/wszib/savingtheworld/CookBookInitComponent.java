package pl.edu.wszib.savingtheworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.edu.wszib.savingtheworld.dao.KsiazkaKucharskaDAO;
import pl.edu.wszib.savingtheworld.dao.PrzepisDAO;
import pl.edu.wszib.savingtheworld.dao.SkladnikDAO;
import pl.edu.wszib.savingtheworld.dao.TypSkladnikaDAO;

import javax.annotation.PostConstruct;
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

        TypSkladnika typSkladnika1 = new TypSkladnika("Sól");
        TypSkladnika typSkladnika1Saved = typSkladnikaDAO.save(typSkladnika1);
        TypSkladnika typSkladnika2 = new TypSkladnika("Pieprz");
        TypSkladnika typSkladnika2Saved = typSkladnikaDAO.save(typSkladnika2);
        TypSkladnika typSkladnika3 = new TypSkladnika("ser");
        TypSkladnika typSkladnika3Saved = typSkladnikaDAO.save(typSkladnika3);
        TypSkladnika typSkladnika4 = new TypSkladnika("mąka");
        TypSkladnika typSkladnika4Saved = typSkladnikaDAO.save(typSkladnika4);

        IntStream.range(0,10).forEach(i->{
            Skladnik skladnik = new Skladnik(i);
            Skladnik skladnikSaved = skladnikDAO.save(skladnik);
        });
    }
}
