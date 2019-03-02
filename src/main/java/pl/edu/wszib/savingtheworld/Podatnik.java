package pl.edu.wszib.savingtheworld;

import javax.persistence.*;

@Entity
@Table
public class Podatnik {
    @Id
    @GeneratedValue
    Long pesel;
    @Column(nullable = false)
    String imie;
    @Column(nullable = false)
    String nazwisko;

    @OneToMany
    Faktura faktury;


    public Podatnik() {
    }

    public Podatnik(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Faktura getFaktura() {
        return faktury;
    }

    public void setFaktura(Faktura faktura) {
        this.faktury = faktura;
    }

    public Long getPesel() {
        return pesel;
    }

    public void setPesel(Long pesel) {
        this.pesel = pesel;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}
