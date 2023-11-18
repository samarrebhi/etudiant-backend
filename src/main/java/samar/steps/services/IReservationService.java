package samar.steps.services;

import org.springframework.data.jpa.repository.JpaRepository;
import samar.steps.entities.Reservation;

public interface IReservationService{

    Reservation addReservation (Reservation r );
    void delete(Reservation r);


}
