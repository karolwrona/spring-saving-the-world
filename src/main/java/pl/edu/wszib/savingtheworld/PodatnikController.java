package pl.edu.wszib.savingtheworld;


import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.edu.wszib.savingtheworld.dao.PodatnikDAO;
import pl.edu.wszib.savingtheworld.dto.PodatnikDTO;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/podatnik")
public class PodatnikController {
    @Autowired
    PodatnikDAO dao;

    @Autowired
    Mapper mapper;

    @GetMapping
    public PodatnikDTO podatnik(@RequestParam Long pesel) {
        return dao.findById(pesel).map(podatnik -> mapper.map(podatnik, PodatnikDTO.class)).orElse(null);
    }
    @GetMapping("/all")
    public List<Podatnik> podatnicy() {
        return StreamSupport.stream(dao.findAll().spliterator(), false).collect(Collectors.toList());
    }
    @PostMapping
    public Podatnik zapisz (Podatnik podatnik){
        return dao.save(mapper.map(podatnik, Podatnik.class));

    }
    @DeleteMapping
    public Podatnik usun(@RequestParam long pesel) {
        Podatnik podatnik = dao.findById(pesel).orElse(null);
        dao.deleteById(pesel);
        return podatnik;
    }
}
