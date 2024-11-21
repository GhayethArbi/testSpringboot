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

public class Projet {

    @Id
//  @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String id;

    private String sujet;

    @OneToOne
    private ProjetDetail projetdetail;

    @ManyToMany(mappedBy = "projets")
    Set<Equipe> equipes;
}
