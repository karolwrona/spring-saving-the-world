package pl.edu.wszib.savingtheworld.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class InitComponent {
    @Autowired
    PodatnikDAO podatnikDAO;
    @PostConstruct
    public void init() {
        podatnikDAO.save(new Podatnik( "Karol", "Wrona"));
        podatnikDAO.save(new Podatnik( "Karol1", "Wrona8"));
        podatnikDAO.save(new Podatnik( "Karol2", "Wrona7"));
        podatnikDAO.save(new Podatnik( "Karol3", "Wrona6"));
        podatnikDAO.save(new Podatnik( "Karol4", "Wrona5"));
        podatnikDAO.save(new Podatnik( "Karol5", "Wrona4"));
        podatnikDAO.save(new Podatnik( "Karol5", "Wrona3"));
        podatnikDAO.save(new Podatnik( "Karol6", "Wrona2"));
        podatnikDAO.save(new Podatnik( "Karol7", "Wrona1"));
        podatnikDAO.save(new Podatnik( "Karol8", "Wrona"));

    }
    @PreDestroy
    public void teardown() {

    }
}
