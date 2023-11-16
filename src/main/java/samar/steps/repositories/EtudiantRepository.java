package samar.steps.repositories;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

import samar.steps.entities.Bloc;
import samar.steps.entities.Etudiant;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {


    Etudiant findEtudiantByCin(long cin);
}
