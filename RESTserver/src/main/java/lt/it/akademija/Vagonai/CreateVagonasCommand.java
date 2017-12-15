package lt.it.akademija.Vagonai;

public class CreateVagonasCommand {
    //Visiems vagonams
    String tipas;
    String gamintojas;
    int kiekis;
    double kaina;
    double turis;


    //Kitiems:
    int klase;
    String lokomotyvas;
    int galia;


    public double getTuris() {
        return turis;
    }

    public void setTuris(double turis) {
        this.turis = turis;
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

    public int getGalia() {
        return galia;
    }

    public void setGalia(int galia) {
        this.galia = galia;
    }
}
