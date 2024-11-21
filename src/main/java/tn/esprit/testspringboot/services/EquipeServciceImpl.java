package tn.esprit.testspringboot.services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.testspringboot.entities.Equipe;
import tn.esprit.testspringboot.repositories.EquipeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EquipeServciceImpl implements IEquipeService {
    EquipeRepository universiteRepository;
    @Override
    public List<Equipe> getEquipes() {
        return universiteRepository.findAll();
    }

    @Override
    public Equipe getEquipeById(Long id) {
        return universiteRepository.findById(id).get();
    }

    @Override
    public Equipe addEquipe(Equipe universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public Equipe updateEquipe(Equipe universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public void deleteEquipe(Long id) {
        universiteRepository.deleteById(id);
    }
}
