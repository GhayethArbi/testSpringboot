package tn.esprit.testspringboot.services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.testspringboot.entities.Equipe;
import tn.esprit.testspringboot.entities.Projet;
import tn.esprit.testspringboot.entities.ProjetDetail;
import tn.esprit.testspringboot.repositories.EquipeRepository;
import tn.esprit.testspringboot.repositories.ProjetDetailRepository;
import tn.esprit.testspringboot.repositories.ProjetRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ProjectServiceImpl implements IProjectService {
    ProjetRepository projetRepository;
    EquipeRepository equipeRepository;
    ProjetDetailRepository projetDetailRepository;
    @Override
    public List<Projet> getProjets() {
        return projetRepository.findAll();
    }

    @Override
    public Projet getProjetById(Long id) {
        return projetRepository.findById(id).get();
    }

    @Override
    public Projet addProjet(Projet universite) {
        return projetRepository.save(universite);
    }

    @Override
    public Projet updateProjet(Projet universite) {
        return projetRepository.save(universite);
    }

    @Override
    public void deleteProjet(Long id) {
        projetRepository.deleteById(id);
    }

    @Override
    public Projet addProjetAndDetailProjetAndAssign(Projet projet) {
        return projetRepository.save(projet);
    }

    @Override
    public void assignProjetDetailToProjet(long idProjet, long idProjetDetail) {
        Projet projet = projetRepository.findById(idProjet).get();
        ProjetDetail projetDetail = projetDetailRepository.findById(idProjetDetail).get();
        projet.setProjetdetail(projetDetail);
        projetRepository.save(projet);
    }

    @Override
    public void assignProjetToEquipe(long idProjet, long idEquipe) {
        Projet projet = projetRepository.findById(idProjet).get();
        Equipe equipe = equipeRepository.findById(idEquipe).get();
        equipe.getProjets().add(projet);
        equipeRepository.save(equipe);

    }

    @Override
    public void addProjetAndAssignDetailProjet(Projet projet, long idDetailProjet) {

        ProjetDetail projetDetail = projetDetailRepository.findById(idDetailProjet).get();
        projet.setProjetdetail(projetDetail);
        projetRepository.save(projet);
    }

    @Override
    public void desAffecterProjetDetailFromProjet(long idProjet) {
        Projet projet = projetRepository.findById(idProjet).get();
        projet.setProjetdetail(null);
        projetRepository.save(projet);
    }

    @Override
    public void desAffecterProjetFromEquipe(long idEquipe, long idProjet) {
        Equipe equipe = equipeRepository.findById(idEquipe).get();
        Projet projet = projetRepository.findById(idProjet).get();
        equipe.getProjets().remove(projet);
        equipeRepository.save(equipe);


    }


}
