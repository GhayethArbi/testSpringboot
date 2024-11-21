package tn.esprit.testspringboot.controlllers;




import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.testspringboot.entities.ProjetDetail;
import tn.esprit.testspringboot.services.IProjectDetailService;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProjectDetailRestController {
    IProjectDetailService iProjetDetailService;

    @GetMapping("/retrieve-all-projetDetails")
    public List<ProjetDetail> retrieveAllProjetDetails(){
        List<ProjetDetail> projetDetailList = iProjetDetailService.getProjetDetails();
        return projetDetailList;
    }
    @GetMapping("/retrieve-projetDetail/{id}")
    public ProjetDetail retrieveProjetDetailById(@PathVariable("id") Long id){
        ProjetDetail projetDetail = iProjetDetailService.getProjetDetailById(id);
        return projetDetail;
    }

    @PostMapping("/add-projetDetail")
    public ProjetDetail addProjetDetail(@RequestBody ProjetDetail projetDetail){
        ProjetDetail projetDetail1 = iProjetDetailService.addProjetDetail(projetDetail);
        return projetDetail1;
    }

    @PutMapping("/update-projetDetail")
    public ProjetDetail updateProjetDetail(@RequestBody ProjetDetail projetDetail){
        ProjetDetail projetDetail1 = iProjetDetailService.updateProjetDetail(projetDetail);
        return projetDetail1;
    }
    @DeleteMapping("/delete-projetDetail/{id}")
    public String deleteProjetDetail(@PathVariable("id") Long id){
        iProjetDetailService.deleteProjetDetail(id);

        return "ProjetDetail deleted";

    }

}