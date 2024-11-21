package tn.esprit.testspringboot.services;

import tn.esprit.testspringboot.entities.ProjetDetail;

import java.util.List;

public interface IProjectDetailService {
    List<ProjetDetail> getProjetDetails();
    ProjetDetail getProjetDetailById(Long id);
    ProjetDetail addProjetDetail(ProjetDetail projetDetail);
    ProjetDetail updateProjetDetail(ProjetDetail proojetDetail);
    void deleteProjetDetail(Long id);


}