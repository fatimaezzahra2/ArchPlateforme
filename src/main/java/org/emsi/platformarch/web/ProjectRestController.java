package org.emsi.platformarch.web;

import com.google.cloud.firestore.QuerySnapshot;
import org.emsi.platformarch.entities.Project;
import org.emsi.platformarch.firebaseData.WeatherForecast;
import org.emsi.platformarch.requests.UploadRequest;
import org.emsi.platformarch.service.IPlatService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@CrossOrigin("*")
public class ProjectRestController {
    private IPlatService iPlatService;

    public ProjectRestController(IPlatService iPlatService) {
        this.iPlatService = iPlatService;
    }

    @GetMapping(path = "/projects")
    public List<Project> productList(){
        return iPlatService.findAllProjects();
    }


    @PostMapping("/projects")
    public Project saveProject(@RequestBody Project project){
        System.out.println("we are in save project controller: "+project.getId()+ " - "+project.getLongitude());

        //we should assign the project an id
        return iPlatService.saveProject(project);}

    @GetMapping(path = "/projects/{id}")
    public ResponseEntity<Project> getProject(@PathVariable(name = "id") String id){
        System.out.println("hello : we are here !");
        return iPlatService.findProjectById(id);
    }

//je pense que celle ci va rester telle qu'elle est parceque c elle qui nous permet de communiquer avec front end
    @PostMapping("/projects/upload")
    public ResponseEntity<String> uploadData(@RequestBody UploadRequest request) {
        System.out.println("they call upload:");
        try {
            // Appel de la méthode uploadData du service DataService
            iPlatService.uploadData(request.getLongitude(), request.getLatitude(), request.getProjectId());
            return ResponseEntity.ok("Données téléchargées avec succès.");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erreur lors du téléchargement des données.");
        }
    }

    @DeleteMapping("/projects/{id}")
    public ResponseEntity<Void> deleteProject(@PathVariable(name = "id") String id) {
        iPlatService.deleteProjectById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(path = "/getData")
    public QuerySnapshot getData() throws ExecutionException, InterruptedException {
        System.out.println("hello : we are here !");
        return iPlatService.getData();
    }




}
