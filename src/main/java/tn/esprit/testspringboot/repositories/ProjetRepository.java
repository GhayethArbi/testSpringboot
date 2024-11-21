package tn.esprit.testspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.testspringboot.entities.Projet;

public interface ProjetRepository extends JpaRepository<Projet, Long> {
}
