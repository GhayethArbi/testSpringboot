package tn.esprit.testspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.testspringboot.entities.Projet;

import java.util.List;


public interface ProjetRepository extends JpaRepository<Projet, Long> {


    //jpql
    @Query("select p from Projet p where p.id = ?1")
    List<Projet> retrieveProjetById(String id);

    @Modifying
    @Query(value = "INSERT INTO projet (sujet, id) VALUES (:sujet, :id)", nativeQuery = true)
    void addProjet(@Param("sujet") String sujet, @Param("id")String id);

    @Modifying
    @Query("UPDATE Projet p SET p.sujet = :projetsujet WHERE p.id = :idProjet")
    void updateProjet(@Param("projetsujet") String sujet, @Param("idProjet") long id);

    @Modifying
    @Query("DELETE FROM Projet p WHERE p.id = :idProjet")
    void deleteProjet(@Param("idProjet") long id);
}
