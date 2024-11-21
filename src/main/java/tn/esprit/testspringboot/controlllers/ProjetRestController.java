package tn.esprit.testspringboot.controlllers;






import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.testspringboot.entities.Projet;
import tn.esprit.testspringboot.services.IProjectService;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProjetRestController {
    IProjectService iProjetService;

    @GetMapping("/retrieve-all-projets")
    public List<Projet> retrieveAllProjets(){
        List<Projet> projetList = iProjetService.getProjets();
        return projetList;
    }
    @GetMapping("/retrieve-projet/{id}")
    public Projet retrieveProjetById(@PathVariable("id") Long id){
        Projet projet = iProjetService.getProjetById(id);
        return projet;
    }

    @PostMapping("/add-projet")
    public Projet addProjet(@RequestBody Projet projet){
        Projet projet1 = iProjetService.addProjet(projet);
        return projet1;
    }

    @PutMapping("/update-projet")
    public Projet updateProjet(@RequestBody Projet projet){
        Projet projet1 = iProjetService.updateProjet(projet);
        return projet1;
    }
    @DeleteMapping("/delete-projet/{id}")
    public String deleteProjet(@PathVariable("id") Long id){
        iProjetService.deleteProjet(id);

        return "Projet deleted";

    }

}