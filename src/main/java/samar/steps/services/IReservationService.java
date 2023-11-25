package samar.steps.services;
import org.springframework.data.jpa.repository.JpaRepository;
import samar.steps.entities.Reservation;

import java.util.List;

public interface IReservationService {
    List<Reservation> getAllReservations();

    Reservation addReservation (Reservation r );


    Reservation findByIdReservation(String id);
}
