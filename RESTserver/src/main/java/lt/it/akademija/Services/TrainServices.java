package lt.it.akademija.Services;

import lt.it.akademija.Repositories.TrainRepository;
import lt.it.akademija.Trains.CreateTrainCommand;
import lt.it.akademija.Trains.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrainServices {

    @Autowired
    TrainRepository trainRepository;



    @Transactional
    public List<Train>  getTrains(){
        if (sumTrains()>=5){
            return trainRepository.findAll();
        }
        return null;
    }

    @Transactional
    public  List<Train> getOneTrain(Long id){
        Train trainas=trainRepository.findOne(id);
        List<Train> singleTrainList= new ArrayList<Train>();
        singleTrainList.add(trainas);
        return  singleTrainList;

    }

    @Transactional
    public void addTrain(@RequestBody CreateTrainCommand ctc){
        Train newTrain = new Train(ctc.getYears(),ctc.getEnterprise(),ctc.getCity());
        trainRepository.save(newTrain);
    }

    @Transactional
    public void removeTrain(Long id){
        Train trainToRemove=trainRepository.findOne(id);
        trainRepository.delete(trainToRemove);
    }

    @Transactional
    public long sumTrains(){
        long trainsNumber=trainRepository.count();
        return trainsNumber;
    }

    @Transactional
    public  void  editTrain(long id,@RequestBody CreateTrainCommand ctc){
        Train trainToEdit=trainRepository.findOne(id);
        trainToEdit.setCity(ctc.getCity());
        trainToEdit.setEnterprise(ctc.getEnterprise());
        trainToEdit.setYears(ctc.getYears());

        trainRepository.save(trainToEdit);

    }

}
