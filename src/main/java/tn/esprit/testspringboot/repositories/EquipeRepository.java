package tn.esprit.testspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.testspringboot.entities.Equipe;

public interface EquipeRepository extends JpaRepository<Equipe, Long> {
}
