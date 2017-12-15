package lt.it.akademija.Services;

import lt.it.akademija.Repositories.VagonasRepository;
import lt.it.akademija.Vagonai.CreateVagonasCommand;
import lt.it.akademija.Vagonai.Vagonas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class VagonasServices {
    @Autowired
    VagonasRepository vagonasRepository;

    @Transactional
    public void addVagonas(String tipas, @RequestBody CreateVagonasCommand cvc){
        cvc.setTipas(tipas);
        Vagonas newVagonas= new Vagonas(cvc.getTipas(),cvc.getGamintojas(),cvc.getKiekis(),cvc.getKaina(),cvc.getGalia(),cvc.getKlase(),cvc.getLokomotyvas(),cvc.getTuris());

        vagonasRepository.save(newVagonas);



    }
//ADD bazinis vagonas
    @Transactional
    public void addBazinisVagonas(Long id,int klase, @RequestBody CreateVagonasCommand cvc) {
        cvc.setTipas("bazinis");
        cvc.setKlase(klase);
        Vagonas newVagonas = new Vagonas(cvc.getTipas(), cvc.getGamintojas(), cvc.getKiekis(), cvc.getKaina(), cvc.getGalia(), cvc.getKlase(), cvc.getLokomotyvas(), cvc.getTuris());
        vagonasRepository.save(newVagonas);
    }
//ADD KROVININIS VAGONAS
    @Transactional
    public void addKrovininisVagonas( Long id,@RequestBody CreateVagonasCommand cvc) {
        cvc.setTipas("krovininis");
        Vagonas newVagonas = new Vagonas(cvc.getTipas(), cvc.getGamintojas(), cvc.getKiekis(), cvc.getKaina(), cvc.getGalia(), cvc.getKlase(), cvc.getLokomotyvas(), cvc.getTuris());
        vagonasRepository.save(newVagonas);
    }

    @Transactional
    public  void addLokomotyvas(Long id,String lokomotyvas, @RequestBody CreateVagonasCommand cvc){
        cvc.setTipas("lokomotyvas");
        cvc.setLokomotyvas(lokomotyvas);
        Vagonas newVagonas = new Vagonas(cvc.getTipas(), cvc.getGamintojas(), cvc.getKiekis(), cvc.getKaina(), cvc.getGalia(), cvc.getKlase(), cvc.getLokomotyvas(), cvc.getTuris());
        vagonasRepository.save(newVagonas);
    }



}
