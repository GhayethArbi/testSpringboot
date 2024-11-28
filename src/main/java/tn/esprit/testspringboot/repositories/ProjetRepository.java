package tn.esprit.testspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.testspringboot.entities.Projet;

public interface ProjetRepository extends JpaRepository<Projet, Long> {


    @Modifying
    @Query(value = "insert into projet(projet_sujet) values (:projetsujet)", nativeQuery = true)
    Projet addProjet(@Param("projetsujet") String sujet);


    @Modifying
    @Query("UPDATE Projet p SET p.sujet = :projetsujet WHERE p.id = :idProjet")
    Projet updateProjet(@Param("projetsujet") String sujet, @Param("idProjet") long id);

    @Modifying
    @Query("delete from Projet p  WHERE p.id = :idProjet")
    Projet updateProjet( @Param("idProjet") long id);

}
