package samar.steps.entities;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="Etudiant")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEtudiant ;

    private String nomEt ;

    private String prenomEt;

    private int cin ;

    private String ecole ;

@Temporal(TemporalType.DATE)
    private LocalDate dateNaissance ;

   private String email;
   private String mdp;







}