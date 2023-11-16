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
    public Long addEtudiant(Etudiant etudiant) {return e.save(etudiant).getIdEtudiant();
    }
    @Override
    public List<Etudiant> addAllEtudiant(List<Etudiant> liste) {
        return e.saveAll(liste);
    }
    @Override
    public List<Etudiant> getAllEtudiants() {
        return (List<Etudiant>) e.findAll();
    }

    @Override
    public Etudiant findById(long id) {return e.findById(id).get();}

    @Override
    public void deleteById(long id) {
        e.deleteById(id);
    }
    @Override
    public void deleteAll() {e.deleteAll();}

    @Override
    public Etudiant findEtudiantByCin(long cin) {
        return  e.findEtudiantByCin(cin);
    }

    @Override
    public Etudiant editEtudiant(Etudiant etudiant) {
        return e.save(etudiant);
    }


}




