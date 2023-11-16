package samar.steps.services;

import samar.steps.entities.Etudiant;

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
}
