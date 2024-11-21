package tn.esprit.testspringboot.services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.testspringboot.entities.Projet;
import tn.esprit.testspringboot.repositories.ProjetRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ProjectServiceImpl implements IProjectService {
    ProjetRepository universiteRepository;
    @Override
    public List<Projet> getProjets() {
        return universiteRepository.findAll();
    }

    @Override
    public Projet getProjetById(Long id) {
        return universiteRepository.findById(id).get();
    }

    @Override
    public Projet addProjet(Projet universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public Projet updateProjet(Projet universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public void deleteProjet(Long id) {
        universiteRepository.deleteById(id);
    }
}
