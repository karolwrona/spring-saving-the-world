package pl.edu.wszib.savingtheworld;

import javax.persistence.*;

@Entity
@Table
public class Faktura {
    @Id
    @GeneratedValue
    Long id;
    double kwota;
    String Tytuł;

    @OneToOne(fetch=FetchType.LAZY, optional = false)
    Podatnik podatnik;

    public Faktura() {}

    public Faktura(double kwota, String tytuł) {
        this.kwota = kwota;
        Tytuł = tytuł;
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
        return Tytuł;
    }

    public void setTytuł(String tytuł) {
        Tytuł = tytuł;
    }

    void setPodatnik(Podatnik podatnik) {
         this.podatnik = podatnik;
    }
}
