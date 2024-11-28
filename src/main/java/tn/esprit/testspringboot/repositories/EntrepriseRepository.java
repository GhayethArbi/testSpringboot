package tn.esprit.testspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.testspringboot.entities.Entreprise;
import tn.esprit.testspringboot.entities.Equipe;

import java.util.List;


@Repository
public interface EntrepriseRepository extends JpaRepository<Entreprise, Long> {


    @Query("select entreprise from Entreprise entreprise where entreprise.adresse =: adresse")
    public List<Entreprise> findByadresse(@Param("adresse") String adresse);


    @Query("select e from Entreprise e where e.adresse = ?1")
    public List<Entreprise> retrieveEntreprisesByAdresse(String adresse);

    @Query(value = "select e from Entreprise e where e.adresse = ?1", nativeQuery = true)
    public List<Entreprise> retrieveEntreprisesByAdresseNative(String adresse);

    

}
