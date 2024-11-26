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
    public List<Projet> retrieveAllProjets() {
        List<Projet> projetList = iProjetService.getProjets();
        return projetList;
    }

    @GetMapping("/retrieve-projet/{id}")
    public Projet retrieveProjetById(@PathVariable("id") Long id) {
        Projet projet = iProjetService.getProjetById(id);
        return projet;
    }

    @PostMapping("/add-projet")
    public Projet addProjet(@RequestBody Projet projet) {
        Projet projet1 = iProjetService.addProjet(projet);
        return projet1;
    }

    @PutMapping("/update-projet")
    public Projet updateProjet(@RequestBody Projet projet) {
        Projet projet1 = iProjetService.updateProjet(projet);
        return projet1;
    }

    @DeleteMapping("/delete-projet/{id}")
    public String deleteProjet(@PathVariable("id") Long id) {
        iProjetService.deleteProjet(id);

        return "Projet deleted";
    }

    @PostMapping("/addProjetAndDetailProjetAndAssign")
    public Projet addProjetAndDetailProjetAndAssign(@RequestBody Projet projet) {
        return iProjetService.addProjetAndDetailProjetAndAssign(projet);
    }


    @PutMapping("/assignProjetDetailToProjet/{idProjet}/{idProjetDetail}")
    public void assignProjetDetailToProjet(@PathVariable("idProjet") long idProjet, @PathVariable("idProjetDetail") long idProjetDetail) {
        iProjetService.assignProjetDetailToProjet(idProjet, idProjetDetail);
    }


    @PutMapping("/assignProjetToEquipe/{idProjet}/{idEquipe}")
    public void assignProjetToEquipe( @PathVariable("idProjet") long idProjet, @PathVariable("idEquipe") long idEquipe) {
        iProjetService.assignProjetToEquipe(idProjet, idEquipe);
    }


    @PostMapping("/addProjetAndAssignDetailProjet/{idDetailProjet}")
    public void addProjetAndAssignDetailProjet(@RequestBody Projet projet, @PathVariable("idDetailProjet") long idDetailProjet){
        iProjetService.addProjetAndAssignDetailProjet(projet, idDetailProjet);
    }
    @PutMapping("/desAffecterProjetDetailFromProjet/{idProjet}")
    public void desAffecterProjetDetailFromProjet(@PathVariable("idProjet") long idProjet){
        iProjetService.desAffecterProjetDetailFromProjet(idProjet);
    }

    @PutMapping("/desAffecterProjetFromEquipe/{idEquipe}/{idProjet}")
    public void desAffecterProjetFromEquipe(@PathVariable("idEquipe") long idEquipe, @PathVariable("idProjet") long idProjet){
        iProjetService.desAffecterProjetFromEquipe(idEquipe,idProjet);
    }




}