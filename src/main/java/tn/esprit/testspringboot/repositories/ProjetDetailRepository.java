package tn.esprit.testspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.testspringboot.entities.ProjetDetail;

public interface ProjetDetailRepository extends JpaRepository<ProjetDetail, Long> {
}
