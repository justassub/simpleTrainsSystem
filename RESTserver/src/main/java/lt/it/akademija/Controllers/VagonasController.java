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

    @RequestMapping(path = "/{id}/add/bazinis/{klase}",method = RequestMethod.POST)
    @ApiOperation(value = "Add bazinis vagonas ",notes = "Doest return anything , justs adds")
    public  void createBazinis (@PathVariable Long id,@PathVariable int klase,@RequestBody CreateVagonasCommand cvc){
        System.out.println(id);
        vagonasServices.addBazinisVagonas(id,klase,cvc);

    }

    @RequestMapping(path = "/{id}/add/krovininis",method = RequestMethod.POST)
    @ApiOperation(value = "Add krovininis vagonas for specialTrain",notes = "Doest return anything , justs adds")
    public  void createKrovininis (@PathVariable Long id,@RequestBody CreateVagonasCommand cvc){
        System.out.println(id);
        vagonasServices.addKrovininisVagonas(id,cvc);

    }
    @RequestMapping(path = "/{id}/add/lokomotyvas/{paskirtis}",method = RequestMethod.POST)
    @ApiOperation(value = "Add vagonas for specialTrain",notes = "Doest return anything , justs adds")
    public  void createKrovininis (@PathVariable Long id,@PathVariable String paskirtis,@RequestBody CreateVagonasCommand cvc){
        System.out.println(id);
       vagonasServices.addLokomotyvas(id,paskirtis,cvc);

    }




}
