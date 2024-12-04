package tn.esprit.testspringboot.services;

import tn.esprit.testspringboot.entities.Projet;

import java.util.List;

public interface IProjectService {

    //crud methods
    List<Projet> getProjets();
    Projet getProjetById(Long id);
    Projet addProjet(Projet projet);
    Projet updateProjet(Projet projet);
    void deleteProjet(Long id);


    //affectation methods
    Projet addProjetAndDetailProjetAndAssign(Projet projet);
    void assignProjetDetailToProjet(long idProjet,long idProjetDetail);
    void assignProjetToEquipe(long idProjet,long idEquipe);
    void addProjetAndAssignDetailProjet(Projet projet,long idDetailProjet);
    void desAffecterProjetDetailFromProjet(long idProjet);
    void desAffecterProjetFromEquipe(long idEquipe, long idProjet);


    //query methodss
    void addProjectQuery(String sujet, String id);
    void updateProjet(String sujet, long id);
    void deleteProjet(long id);

    List<Projet> retrieveProjectById(String id);



}