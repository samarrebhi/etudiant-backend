package samar.steps.services;

import org.springframework.cglib.core.Local;
import samar.steps.entities.Etudiant;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface IEtudiantService {
    Long addEtudiant(Etudiant etudiant);

    List<Etudiant> addAllEtudiant(List<Etudiant> liste);

    List<Etudiant> getAllEtudiants();

    Etudiant findById(long id);

    void deleteById(long id);

    Etudiant editEtudiant(Etudiant etudiant);

    void deleteAll();
    List<Etudiant> findEtudiantsByEcole(String ecole);

   // List<Etudiant> findEtudiantByCin(Long cin) ;

    List<Etudiant>findEtudiantByNomEtContaining(String s);
    Etudiant findEtudiantByEmail(String em);

    List<Etudiant> findEtudiantByDateNaissanceAfter(LocalDate date);

    Etudiant ajouterEtudiantEtAssocierReservation(long id);
}
