package org.emsi.platformarch.web;

import org.emsi.platformarch.entities.Userr;
import org.emsi.platformarch.repository.UserRepository;
import org.emsi.platformarch.service.IPlatService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")//j'autorise tous les domaines a communiquer avec cette api (ce backend) et d'envoyer des requetes
public class UserRestController {
    private IPlatService iPlatService;

    public UserRestController(IPlatService iPlatService) {
        this.iPlatService = iPlatService;
    }

    //methode qui permet de consulter la liste des users
    //pour acceder a cette methode on utilise une methode getMapping /users

    /*
    @GetMapping("/users")
    public List<Userr> userList(){
        System.out.println("bonjour nous somme appelé 1 ");

       // return userRepository.findAll();
    }*/

    @PostMapping("/userr")
    public Userr saveUser(@RequestBody Userr userr){
        System.out.println("bonjour nous somme appelé 2 ");
        //we should assign the project an id
        return iPlatService.saveUser(userr);
    }




}
