package lt.it.akademija.Controllers;

import io.swagger.annotations.ApiOperation;
import lt.it.akademija.Services.VagonasServices;
import lt.it.akademija.Trains.CreateTrainCommand;
import lt.it.akademija.Vagonai.CreateVagonasCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/vagonai")
@CrossOrigin(origins = "http://localhost:3000")
public class VagonasController {

    @Autowired
    VagonasServices vagonasServices;

    @Autowired
    public VagonasController(VagonasServices vagonasServices){
        this.vagonasServices=vagonasServices;
    }

    @RequestMapping(path = "/add/bazinis/{klase}",method = RequestMethod.POST)
    @ApiOperation(value = "Add bazinis vagonas ",notes = "Doest return anything , justs adds")
    public  void createBazinis (@PathVariable int klase,@RequestBody CreateVagonasCommand cvc){
        vagonasServices.addBazinisVagonas(klase,cvc);

    }

    @RequestMapping(path = "/add/krovininis",method = RequestMethod.POST)
    @ApiOperation(value = "Add krovininis vagonas for specialTrain",notes = "Doest return anything , justs adds")
    public  void createKrovininis (@RequestBody CreateVagonasCommand cvc){
        vagonasServices.addKrovininisVagonas(cvc);

    }
    @RequestMapping(path = "/add/lokomotyvas/{paskirtis}",method = RequestMethod.POST)
    @ApiOperation(value = "Add vagonas for specialTrain",notes = "Doest return anything , justs adds")
    public  void createKrovininis (@PathVariable String paskirtis,@RequestBody CreateVagonasCommand cvc){
       vagonasServices.addLokomotyvas(paskirtis,cvc);

    }




}
