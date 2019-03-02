package pl.edu.wszib.savingtheworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.edu.wszib.savingtheworld.dao.FakturaDAO;
import pl.edu.wszib.savingtheworld.dao.PodatnikDAO;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

@Component
public class InitComponent {
    @Autowired
    PodatnikDAO podatnikDAO;
    @Autowired
    FakturaDAO fakturaDAO;
    @PostConstruct
    public void init() {
        /*podatnikDAO.save(new Podatnik( "Karol", "Wrona"));
        podatnikDAO.save(new Podatnik( "Karol1", "Wrona8"));
        podatnikDAO.save(new Podatnik( "Karol2", "Wrona7"));
        podatnikDAO.save(new Podatnik( "Karol3", "Wrona6"));
        podatnikDAO.save(new Podatnik( "Karol4", "Wrona5"));
        podatnikDAO.save(new Podatnik( "Karol5", "Wrona4"));
        podatnikDAO.save(new Podatnik( "Karol5", "Wrona3"));
        podatnikDAO.save(new Podatnik( "Karol6", "Wrona2"));
        podatnikDAO.save(new Podatnik( "Karol7", "Wrona1"));
        podatnikDAO.save(new Podatnik( "Karol8", "Wrona"));*/

        List<Faktura> wszystkie = fakturaDAO.findAll();

        IntStream.range(0,10).forEach(i ->{
            Faktura faktura = new Faktura(3.50, "Coś"+i);
            faktura = fakturaDAO.save(faktura);
            });

        IntStream.range(0,50).forEach(i -> {
            Podatnik podatnik = new Podatnik("Zdzich"+i, "Krecina");
           // podatnik.setFaktura(Arrays.asList(wszystkie.get(i%10), wszystkie.get((i+5)%10)));
            podatnik = podatnikDAO.save(podatnik);
            podatnik.getImie();
        });

        System.out.println("");

    }
    @PreDestroy
    public void teardown() {

    }
}
