package lt.it.akademija.Controllers;

import io.swagger.annotations.ApiOperation;
import lt.it.akademija.Services.VagonasServices;
import lt.it.akademija.Trains.CreateTrainCommand;
import lt.it.akademija.Vagonai.CreateVagonasCommand;
import lt.it.akademija.Vagonai.Vagonas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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
    public  void createBazinis (@Valid @PathVariable Long id,@PathVariable int klase,@RequestBody CreateVagonasCommand cvc){
        System.out.println(id);
        vagonasServices.addBazinisVagonas(id,klase,cvc);

    }

    @RequestMapping(path = "/{id}/add/krovininis",method = RequestMethod.POST)
    @ApiOperation( value = "Add krovininis vagonas for specialTrain",notes = "Doest return anything , justs adds")
    public  void createKrovininis (@Valid @PathVariable Long id,@RequestBody CreateVagonasCommand cvc){
        System.out.println(id);
        vagonasServices.addKrovininisVagonas(id,cvc);

    }
    @RequestMapping(path = "/{id}/add/lokomotyvas/{paskirtis}",method = RequestMethod.POST)
    @ApiOperation(value = "Add vagonas for specialTrain",notes = "Doest return anything , justs adds")
    public  void createKrovininis (@Valid @PathVariable Long id, @PathVariable String paskirtis, @RequestBody CreateVagonasCommand cvc){
         vagonasServices.addLokomotyvas(id,paskirtis,cvc);

    }
    @RequestMapping(path="/all",method = RequestMethod.GET)
    @ApiOperation(value = "See All vagons")
    public List<Vagonas> allVagons(){
        return vagonasServices.seeAll();
    }
    @RequestMapping(path="/{id}",method = RequestMethod.GET)
    @ApiOperation(value = "See all vagons for specific train")
    public  List<Vagonas> vagonsWithSpecificTrain(@PathVariable long id ){
        return vagonasServices.findForOne(id);
    }
//    @RequestMapping(path = "/{id}/price",method = RequestMethod.GET)
//    @ApiOperation(value = "Get ALL train worth")
//    public double trainPrice(@PathVariable long id){
//        return vagonasServices.getTrainPrice(id);
//    }
    @RequestMapping(path = "/delete/{id}",method = RequestMethod.DELETE)
    public  void deleteVagona(@PathVariable long id){
        vagonasServices.remove(id);


        }




}
