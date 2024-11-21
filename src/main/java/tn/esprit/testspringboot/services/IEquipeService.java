package tn.esprit.testspringboot.services;

import tn.esprit.testspringboot.entities.Equipe;

import java.util.List;


public interface IEquipeService {
    List<Equipe> getEquipes();
    Equipe getEquipeById(Long id);
    Equipe addEquipe(Equipe equipe);
    Equipe updateEquipe(Equipe equipe);
    void deleteEquipe(Long id);


}