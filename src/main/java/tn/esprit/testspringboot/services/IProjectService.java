package tn.esprit.testspringboot.services;

import tn.esprit.testspringboot.entities.Projet;

import java.util.List;

public interface IProjectService {
    List<Projet> getProjets();
    Projet getProjetById(Long id);
    Projet addProjet(Projet projet);
    Projet updateProjet(Projet projet);
    void deleteProjet(Long id);

    Projet addProjetAndDetailProjetAndAssign(Projet projet);
    void assignProjetDetailToProjet(long idProjet,long idProjetDetail);
    void assignProjetToEquipe(long idProjet,long idEquipe);
    void addProjetAndAssignDetailProjet(Projet projet,long idDetailProjet);
    void desAffecterProjetDetailFromProjet(long idProjet);
    void desAffecterProjetFromEquipe(long idEquipe, long idProjet);






}