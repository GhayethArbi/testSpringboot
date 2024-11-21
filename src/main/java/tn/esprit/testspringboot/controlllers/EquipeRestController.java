package tn.esprit.testspringboot.controlllers;




import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.testspringboot.entities.Equipe;
import tn.esprit.testspringboot.services.IEquipeService;

import java.util.List;

@RestController
@AllArgsConstructor
public class EquipeRestController {
    IEquipeService iEquipeService;

    @GetMapping("/retrieve-all-equipes")
    public List<Equipe> retrieveAllEquipes(){
        List<Equipe> equipeList = iEquipeService.getEquipes();
        return equipeList;
    }
    @GetMapping("/retrieve-equipe/{id}")
    public Equipe retrieveEquipeById(@PathVariable("id") Long id){
        Equipe equipe = iEquipeService.getEquipeById(id);
        return equipe;
    }

    @PostMapping("/add-equipe")
    public Equipe addEquipe(@RequestBody Equipe equipe){
        Equipe equipe1 = iEquipeService.addEquipe(equipe);
        return equipe1;
    }

    @PutMapping("/update-equipe")
    public Equipe updateEquipe(@RequestBody Equipe equipe){
        Equipe equipe1 = iEquipeService.updateEquipe(equipe);
        return equipe1;
    }
    @DeleteMapping("/delete-equipe/{id}")
    public String deleteEquipe(@PathVariable("id") Long id){
        iEquipeService.deleteEquipe(id);

        return "Equipe deleted";

    }

}
