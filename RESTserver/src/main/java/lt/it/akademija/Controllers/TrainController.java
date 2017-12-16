package lt.it.akademija.Controllers;

import io.swagger.annotations.ApiOperation;
import lt.it.akademija.Services.TrainServices;
import lt.it.akademija.Trains.CreateTrainCommand;
import lt.it.akademija.Trains.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/trains")
@CrossOrigin(origins = "http://localhost:3000")
public class TrainController {

    @Autowired
    private final TrainServices trainServices;

    @Autowired
    public TrainController(TrainServices trainServisas){
        this.trainServices=trainServisas;
    }

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "GETS trains", notes = "Gets trains if >=5")
    public List<Train> getTrains(){
        return trainServices.getTrains();

    }

    @RequestMapping(path = "/{id}",method = RequestMethod.GET)
    @ApiOperation(value = "Get ONE train", notes = "Returs ONE  train as List")
    public List<Train> getOneProducts(@PathVariable Long id) {
        return trainServices.getOneTrain(id);
    }

    @RequestMapping(path = "/addtrain",method = RequestMethod.POST)
    @ApiOperation(value = "Add One Train to trainList",notes = "Doest return anything , justs adds")
    public  void addTrain (@RequestBody CreateTrainCommand ctc){
        System.out.println(ctc.getCity()+ctc.getYears()+ctc.getEnterprise());

        trainServices.addTrain(ctc);

    }

    @RequestMapping(path = "/edit/{id}",method = RequestMethod.PUT)
    @ApiOperation(value = "Edits train",notes="Just edits train ")
    public  void editTrain(@PathVariable Long id , @RequestBody CreateTrainCommand ctc){
        trainServices.editTrain(id,ctc);
    }

    @RequestMapping(path = "/findByCity/{city}",method = RequestMethod.GET)
    @ApiOperation(value = "find tray by city", notes = "find city")
    public List<Train> trainListByCity( @PathVariable String city){
      return   trainServices.findListByCity(city);
    }
    @RequestMapping(path="/findByYear/{year1}/{year2}",method = RequestMethod.GET)
    public  List<Train> trainListBetweenYears(@PathVariable int year1,@PathVariable int year2){
        return trainServices.findListBetweenYears(year1,year2);
    }
    @RequestMapping(path = "/remove/{id}",method = RequestMethod.DELETE)
    @ApiOperation(value = "removes train",notes = "removes train by train ID")
    public  void removeTrain(@PathVariable Long id){
        trainServices.removeTrain(id);
    }














}
