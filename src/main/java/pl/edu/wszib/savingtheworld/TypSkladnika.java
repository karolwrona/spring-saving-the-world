package pl.edu.wszib.savingtheworld;



import javax.persistence.*;

@Entity
@Table
public class TypSkladnika {
    @Id
    @GeneratedValue
    Long id;
    @Column(unique = true)
    String nazwa; //unikalna


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

}
