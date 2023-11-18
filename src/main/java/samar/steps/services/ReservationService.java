package samar.steps.services;
import org.springframework.stereotype.Service;
import samar.steps.entities.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import samar.steps.repositories.ReservationRepository;

@Service
public class ReservationService implements IReservationService{
    @Autowired
    ReservationRepository r;


    @Override
    public Reservation addReservation(Reservation reservation) {
        return r.save(reservation);}
    @Override
    public void delete(Reservation r) {

    }
}
