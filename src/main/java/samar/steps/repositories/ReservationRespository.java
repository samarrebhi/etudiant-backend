package samar.steps.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import samar.steps.entities.Reservation;

import java.util.List;

public interface ReservationRespository extends JpaRepository<Reservation,String> {
    Reservation findByIdReservation(String idReserv);}

