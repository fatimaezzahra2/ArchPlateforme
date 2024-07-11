package org.emsi.platformarch.web;

import org.emsi.platformarch.requests.AlgoTwoRequest;
import org.emsi.platformarch.requests.SizingBatteryRequest;
import org.emsi.platformarch.entities.Charges;
import org.emsi.platformarch.requests.SizingPvRequest;
import org.emsi.platformarch.requests.SizingWtRequest;
import org.emsi.platformarch.service.IPlatService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@CrossOrigin("*")
public class ChargeRestController {
    private IPlatService iPlatService;

    public ChargeRestController(IPlatService iPlatService) {
        this.iPlatService = iPlatService;
    }

    @GetMapping("/charges")
    public List<Charges> chargesList(){
        return iPlatService.findAllCharges();
    }


    @GetMapping("/charges/project/{projectId}")
    public List<Charges> findChargesByProject(@PathVariable(name = "projectId")String projectId){
        return iPlatService.findChargesByProject(projectId);
    }

    @GetMapping("/charges/{id}")
    public Charges findChargesById(@PathVariable(name = "id")String id){
        return iPlatService.findChargeById(id).getBody();
    }


    @PostMapping("/charges")
    public Charges addCharge( @RequestBody Charges charge){
        return iPlatService.saveOrUpdateCharge(charge);
    }

    @DeleteMapping("/charges/{id}")
    public ResponseEntity<Void> deleteCharge(@PathVariable(name = "id") String id) {
        iPlatService.deleteChargeById(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping(value = "/charges/{projectId}", produces ={MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML},consumes = {MediaType.APPLICATION_JSON} )
    public void addChargeToProject(@PathVariable(name="projectId") String projectId, @RequestBody Charges charge){
         iPlatService.addChargeToProject(projectId,charge);
    }

    @PostMapping(value = "/charges/Energie")
    public long[] calculateEnergy(@RequestBody List<Charges> charges){
        return iPlatService.calculateEnergy(charges);
    }

    @PostMapping(value = "/charges/sizingBattery")
    public double sizingBattery(@RequestBody SizingBatteryRequest request){
        System.out.println("hello Battery");
        System.out.println("request id: "+request.getId()+", request Nj: "+request.getNj());
        return iPlatService.sizingBattery(request.getId(), request.getNj(), request.getD(), request.getU());
    }
    @PostMapping(value = "/charges/sizingWt")
    public double sizingWt(@RequestBody SizingWtRequest request) throws ExecutionException, InterruptedException {
        System.out.println("hello wt");
        return iPlatService.sizingWt(request);
    }
    @PostMapping(value = "/charges/sizingPv")
    public double[] sizingPv(@RequestBody SizingPvRequest request) throws ExecutionException, InterruptedException {
        System.out.println("hello PV: ");
        return iPlatService.sizingPv(request);
    }
    @PostMapping(value = "/charges/sizing")
    public double sizing(@RequestBody AlgoTwoRequest request) throws ExecutionException, InterruptedException {
        System.out.println("hello sizing method is executed : "+ "rayon: "+request.getRayon());
        return iPlatService.algo2(request);
    }


}


