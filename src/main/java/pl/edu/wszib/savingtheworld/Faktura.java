package pl.edu.wszib.savingtheworld;

import javax.persistence.*;

@Entity
@Table
public class Faktura {
    @Id
    @GeneratedValue
    Long id;
    double kwota;
    String tytul;

    @ManyToOne(fetch=FetchType.EAGER, optional = false)
    @JoinColumn(name="podatnik_id", nullable = false)
    Podatnik podatnik;

    public Faktura() {}

    public Faktura(double kwota, String tytuł) {
        this.kwota = kwota;
        this.tytul = tytuł;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        this.kwota = kwota;
    }

    public String getTytuł() {
        return tytul;
    }

    public void setTytuł(String tytuł) {
        this.tytul = tytuł;
    }

    void setPodatnik(Podatnik podatnik) {
         this.podatnik = podatnik;
    }
}
