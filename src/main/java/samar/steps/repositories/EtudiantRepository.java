package samar.steps.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import samar.steps.entities.Etudiant;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    List<Etudiant> findEtudiantsByEcole(String ecole);
    Etudiant findEtudiantByCin(Long cin);
    List<Etudiant> findEtudiantByNomEtContaining(String s);
    Etudiant findEtudiantByEmail(String em);
    List<Etudiant> findEtudiantByDateNaissanceAfter(LocalDate date);

}
