package lt.it.akademija.Services;

import lt.it.akademija.Repositories.TrainRepository;
import lt.it.akademija.Repositories.VagonasRepository;
import lt.it.akademija.Trains.Train;
import lt.it.akademija.Vagonai.CreateVagonasCommand;
import lt.it.akademija.Vagonai.Vagonas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.Collections;
import java.util.List;

@Service
public class VagonasServices {
    @Autowired
    VagonasRepository vagonasRepository;
    @Autowired
    TrainRepository trainRepository;

    @Transactional
    public void addVagonas(String tipas, @RequestBody CreateVagonasCommand cvc){
        cvc.setTipas(tipas);
        Vagonas newVagonas= new Vagonas(cvc.getTipas(),cvc.getGamintojas(),cvc.getKiekis(),cvc.getKaina(),cvc.getGalia(),cvc.getKlase(),cvc.getLokomotyvas(),cvc.getTuris());

        vagonasRepository.save(newVagonas);



    }
//ADD bazinis vagonas
    @Transactional
    public void addBazinisVagonas( Long id,int klase, @RequestBody CreateVagonasCommand cvc) {
        cvc.setTipas("bazinis");
        cvc.setKlase(klase);
        Vagonas newVagonas = new Vagonas(cvc.getTipas(), cvc.getGamintojas(), cvc.getKiekis(), cvc.getKaina(), cvc.getGalia(), cvc.getKlase(), cvc.getLokomotyvas(), cvc.getTuris());
        vagonasRepository.save(newVagonas);
        Train ieskomasTraukinys=trainRepository.findOne(id);
        ieskomasTraukinys.addVagonas(newVagonas);
    }
//ADD KROVININIS VAGONAS
    @Transactional
    public void addKrovininisVagonas(  Long id,@RequestBody CreateVagonasCommand cvc) {
        cvc.setTipas("krovininis");
        Vagonas newVagonas = new Vagonas(cvc.getTipas(), cvc.getGamintojas(), cvc.getKiekis(), cvc.getKaina(), cvc.getGalia(), cvc.getKlase(), cvc.getLokomotyvas(), cvc.getTuris());
        vagonasRepository.save(newVagonas);
        Train ieskomasTraukinys=trainRepository.findOne(id);
        ieskomasTraukinys.addVagonas(newVagonas);
        newVagonas.setTrain(ieskomasTraukinys);
    }

    @Transactional
    public  void addLokomotyvas( Long id, String lokomotyvas, @RequestBody CreateVagonasCommand cvc){
        cvc.setTipas("lokomotyvas");
        cvc.setLokomotyvas(lokomotyvas);
        Vagonas newVagonas = new Vagonas(cvc.getTipas(), cvc.getGamintojas(), cvc.getKiekis(), cvc.getKaina(), cvc.getGalia(), cvc.getKlase(), cvc.getLokomotyvas(), cvc.getTuris());
        vagonasRepository.save(newVagonas);
        Train ieskomasTraukinys=trainRepository.findOne(id);
        ieskomasTraukinys.addVagonas(newVagonas);

    }

    @Transactional
    public List<Vagonas> seeAll(){

        return vagonasRepository.findAll();
    }

    @Transactional
    public List<Vagonas> findForOne(Long id){

        Train train=trainRepository.findOne(id);
        if (train.getVagonai().size()<3){
            return Collections.emptyList();
        }
        return  train.getVagonai();
    }

//    @Transactional
//    public  double getTrainPrice(long id){
//        double price=vagonasRepository.trainPrice(id);
//        return  price;
//    }

    @Transactional
    public void remove(long id){
        vagonasRepository.delete(id);
    }



}
