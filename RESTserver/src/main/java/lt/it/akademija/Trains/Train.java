package lt.it.akademija.Trains;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lt.it.akademija.Vagonai.Vagonas;

import javax.persistence.*;
import java.util.List;

@Entity

public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;

    @Column
    private int years;

    @Column
    private String enterprise;

    @Column
    private  String city;
    public  Train(){

    }
    @OneToMany(mappedBy = "train")
    @JsonIgnore
    private List<Vagonas> vagonai;

    public void addVagonas(Vagonas vagonas){

        this.vagonai.add(vagonas);
        vagonas.setTrain(this);
    }

    public List<Vagonas> getVagonai() {
        return vagonai;
    }

    public void setVagonai(List<Vagonas> vagonai) {
        this.vagonai = vagonai;
    }

    public Train(int years, String enterprise, String city) {
        this.years = years;
        this.enterprise = enterprise;
        this.city = city;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
