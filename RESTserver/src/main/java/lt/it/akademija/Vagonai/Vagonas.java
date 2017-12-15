package lt.it.akademija.Vagonai;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lt.it.akademija.Trains.Train;

import javax.persistence.*;
import javax.validation.constraints.Max;

@Entity

public class Vagonas {
//VISIEMS TRAUKINIAMS
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column
    String tipas;
    @Column
    String gamintojas;
    @Column
    int kiekis;
    @Column
     @Max(1000000)
     double kaina;
    @Column
    double turis;

//skirtingiems

    @Column
    int klase;
    @Column
    String lokomotyvas;//traukia or stumia
    @Column
    double galia;

    @ManyToOne
    @JoinColumn(name="train_id")
    private Train train;

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Vagonas(){

    }
    public Vagonas(String tipas, String gamintojas, int kiekis, double kaina, double galia, int klase, String lokomotyvas, double turis) {
        this.tipas = tipas;
        this.gamintojas = gamintojas;
        this.kiekis = kiekis;
        this.kaina = kaina;
        this.turis = turis;
        this.galia = galia;
        this.klase = klase;
        this.lokomotyvas = lokomotyvas;
        this.galia = galia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipas() {
        return tipas;
    }

    public void setTipas(String tipas) {
        this.tipas = tipas;
    }

    public String getGamintojas() {
        return gamintojas;
    }

    public void setGamintojas(String gamintojas) {
        this.gamintojas = gamintojas;
    }

    public int getKiekis() {
        return kiekis;
    }

    public void setKiekis(int kiekis) {
        this.kiekis = kiekis;
    }

    public double getKaina() {
        return kaina;
    }

    public void setKaina(double kaina) {
        this.kaina = kaina;
    }

    public double getGalia() {
        return galia;
    }

    public void setGalia(double galia) {
        this.galia = galia;
    }

    public int getKlase() {
        return klase;
    }

    public void setKlase(int klase) {
        this.klase = klase;
    }

    public String getLokomotyvas() {
        return lokomotyvas;
    }

    public void setLokomotyvas(String lokomotyvas) {
        this.lokomotyvas = lokomotyvas;
    }

    public double getTuris() {
        return turis;
    }

    public void setTuris(double turis) {
        this.turis = turis;
    }
}
