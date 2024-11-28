package tn.esprit.testspringboot.entities;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Entreprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEntreprise;
    private String name;
    private String adresse;
    @OneToMany(mappedBy = "entreprise")
    private Set<Equipe> equipes;
}
