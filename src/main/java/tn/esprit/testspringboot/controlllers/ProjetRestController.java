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
        return iProjetService.getProjets();
    }

    @GetMapping("/retrieve-projet/{id}")
    public Projet retrieveProjetById(@PathVariable("id") Long id) {
        return iProjetService.getProjetById(id);
    }

    @PostMapping("/add-projet")
    public Projet addProjet(@RequestBody Projet projet) {
        return iProjetService.addProjet(projet);
    }

    @PutMapping("/update-projet")
    public Projet updateProjet(@RequestBody Projet projet) {
        return iProjetService.updateProjet(projet);
    }

    @DeleteMapping("/delete-projet/{id}")
    public String deleteProjet(@PathVariable("id") Long id) {
        iProjetService.deleteProjet(id);
        return "Projet deleted";
    }





    //Affectation apis
    @PostMapping("/addProjetAndDetailProjetAndAssign")
    public Projet addProjetAndDetailProjetAndAssign(@RequestBody Projet projet) {
        return iProjetService.addProjetAndDetailProjetAndAssign(projet);
    }

    @PutMapping("/assignProjetDetailToProjet/{idProjet}/{idProjetDetail}")
    public void assignProjetDetailToProjet(@PathVariable("idProjet") long idProjet, @PathVariable("idProjetDetail") long idProjetDetail) {
        iProjetService.assignProjetDetailToProjet(idProjet, idProjetDetail);
    }

    @PutMapping("/assignProjetToEquipe/{idProjet}/{idEquipe}")
    public void assignProjetToEquipe(@PathVariable("idProjet") long idProjet, @PathVariable("idEquipe") long idEquipe) {
        iProjetService.assignProjetToEquipe(idProjet, idEquipe);
    }

    @PostMapping("/addProjetAndAssignDetailProjet/{idDetailProjet}")
    public void addProjetAndAssignDetailProjet(@RequestBody Projet projet, @PathVariable("idDetailProjet") long idDetailProjet) {
        iProjetService.addProjetAndAssignDetailProjet(projet, idDetailProjet);
    }

    @PutMapping("/desAffecterProjetDetailFromProjet/{idProjet}")
    public void desAffecterProjetDetailFromProjet(@PathVariable("idProjet") long idProjet) {
        iProjetService.desAffecterProjetDetailFromProjet(idProjet);
    }

    @PutMapping("/desAffecterProjetFromEquipe/{idEquipe}/{idProjet}")
    public void desAffecterProjetFromEquipe(@PathVariable("idEquipe") long idEquipe, @PathVariable("idProjet") long idProjet) {
        iProjetService.desAffecterProjetFromEquipe(idEquipe, idProjet);
    }






    //jpql apis
    @PostMapping("/createProjetWithQuery")
    public String createProjetWithQuery(@RequestBody Projet p) {
        iProjetService.addProjectQuery(p.getSujet(), p.getId());
        return "Project created successfully";
    }

    @PutMapping("updateProjetWithQuery/{id}")
    public void updateProjetWithQuery(@RequestBody String sujet, @PathVariable("id") long id) {
        iProjetService.updateProjet(sujet, id);
    }

    @DeleteMapping("/deleteProjectWithQuery/{id}")
    public String deleteProjectWithQuery(@PathVariable("id") long id) {
        iProjetService.deleteProjet(id);
        return "projet supprimé avec succes";
    }

    @GetMapping("retrieveProjectById/{id}")
    public List<Projet> retrieveProjetById(@PathVariable("id") String id) {
        return iProjetService.retrieveProjectById(id);
    }
}