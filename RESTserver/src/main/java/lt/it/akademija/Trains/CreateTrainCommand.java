package lt.it.akademija.Trains;

public class CreateTrainCommand {
    private int years;
    private  String enterprise;
    private String city;



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
