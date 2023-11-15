package samar.steps.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import samar.steps.entities.Etudiant;
import samar.steps.repositories.EtudiantRepository;

import java.util.List;

@Service
public class EtudiantService implements IEtudiantService {

    @Autowired
    public EtudiantRepository e;

    @Override
    public Long addEtudiant(Etudiant etudiant) {

        return e.save(etudiant).getIdEtudiant();
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return (List<Etudiant>) e.findAll();
    }

    @Override
    public void deleteById(long id) {
        e.deleteById(id);
    }
    }


