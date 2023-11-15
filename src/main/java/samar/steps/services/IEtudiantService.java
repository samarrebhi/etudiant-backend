package samar.steps.services;

import samar.steps.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Long addEtudiant(Etudiant etudiant);

    List<Etudiant> getAllEtudiants();


    void deleteById(long id);


}
