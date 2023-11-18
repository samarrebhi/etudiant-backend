package samar.steps.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import samar.steps.entities.Etudiant;
import samar.steps.entities.Reservation;
import samar.steps.repositories.EtudiantRepository;
import samar.steps.repositories.ReservationRepository;

import java.time.LocalDate;
import java.util.Date;
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
    public Etudiant editEtudiant(Etudiant etudiant) {
        return e.save(etudiant);
    }

@Override
    public List<Etudiant> findEtudiantsByEcole(String ecole){
        return e.findEtudiantsByEcole(ecole);
}

    @Override
    public List<Etudiant> findEtudiantByNomEtContaining(String s) {
        return e.findEtudiantByNomEtContaining(s);
    }

    @Override
    public Etudiant findEtudiantByEmail(String em) {
        return e.findEtudiantByEmail(em);
    }

    @Override
    public List<Etudiant> findEtudiantByDateNaissanceAfter(LocalDate date) {
        return e.findEtudiantByDateNaissanceAfter(date);
    }


    /*@Override
    public List<Etudiant> findEtudiantByCin(Long cin) {
        return e.findEtudiantByCin(cin);
    }*/

    // ajouterEtudiantEtAffecterReservation
    ReservationRepository reservationRepository;
    @Override
    public Etudiant ajouterEtudiantEtAssocierReservation(long id) {

        //---------------------------------
        LocalDate dateDebutAU;
        LocalDate dateFinAU;
        int year = LocalDate.now().getYear() % 100;
        if (LocalDate.now().getMonthValue() <= 7) {
            dateDebutAU = LocalDate.of(Integer.parseInt("20" + (year - 1)), 9, 15);
            dateFinAU = LocalDate.of(Integer.parseInt("20" + year), 6, 30);
        } else {
            dateDebutAU = LocalDate.of(Integer.parseInt("20" + year), 9, 15);
            dateFinAU = LocalDate.of(Integer.parseInt("20" + (year + 1)), 6, 30);
        }
        //---------------------------------;
        // Find the student based on the provided id
        Etudiant etudiant;
        etudiant = e.findById(id).get();

        // Return the student with the associated reservation
        // Create a new student if not found
        if (etudiant == null) {
            etudiant = new Etudiant();


            // Save the new student
            e.save(etudiant);
        }

        // Create a new reservation
        Reservation r = new Reservation();
        // Set properties for the reservation, e.g., ID, dates, etc.
        r.setIdReservation(dateDebutAU.getYear()+"/"+dateFinAU.getYear());
        r.setAnneeReservation(new Date());
        r.setEstValide(true); // Implement this method

        // Associate the reservation with the student
        etudiant.getReservations().add(r);

        // Associate the student with the reservation (many-to-many)
        r.getEtudiants().add(etudiant);

        // Save the changes
        e.save(etudiant);
        reservationRepository.save(r);


        return etudiant;
    }

    }






