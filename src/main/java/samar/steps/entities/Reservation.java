package samar.steps.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Reservation")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Reservation {
    @Id
   //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idReservation;

    private Date anneeReservation ;
    private Boolean estValide ;

    //association with table Etudiant
    @ManyToMany(cascade = CascadeType.ALL)
    public Set<Etudiant> etudiants = new HashSet<>();

}



