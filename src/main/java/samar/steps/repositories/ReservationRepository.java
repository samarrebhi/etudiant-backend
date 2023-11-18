package samar.steps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import samar.steps.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,String> {
}
