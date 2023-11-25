package samar.steps.services;
import org.springframework.stereotype.Service;
import samar.steps.entities.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import samar.steps.repositories.ReservationRespository;

import java.util.List;

@Service
public class ReservationService implements IReservationService{
    @Autowired
    ReservationRespository r;

    @Override
    public List<Reservation> getAllReservations() {
        return (List<Reservation>) r.findAll();
    }

    @Override
    public Reservation addReservation(Reservation reservation) {
        return r.save(reservation);}

    @Override
    public Reservation findByIdReservation(String id) {
        return r.findByIdReservation(id);
    }
}