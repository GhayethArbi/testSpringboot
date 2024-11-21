package tn.esprit.testspringboot.services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.testspringboot.entities.ProjetDetail;
import tn.esprit.testspringboot.repositories.ProjetDetailRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ProjectDetailServiceImpl implements IProjectDetailService {
    ProjetDetailRepository universiteRepository;
    @Override
    public List<ProjetDetail> getProjetDetails() {
        return universiteRepository.findAll();
    }

    @Override
    public ProjetDetail getProjetDetailById(Long id) {
        return universiteRepository.findById(id).get();
    }

    @Override
    public ProjetDetail addProjetDetail(ProjetDetail universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public ProjetDetail updateProjetDetail(ProjetDetail universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public void deleteProjetDetail(Long id) {
        universiteRepository.deleteById(id);
    }
}
