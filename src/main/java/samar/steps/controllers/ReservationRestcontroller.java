package samar.steps.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import samar.steps.entities.Reservation;
import samar.steps.services.ReservationService;

@RestController
@RequestMapping("/reservations")
public class ReservationRestcontroller {

    @Autowired
    ReservationService Ser;
    @PostMapping("/addreservation")
    Reservation addReservation(@RequestBody Reservation r){
        return Ser.addReservation(r);
    }

    @DeleteMapping("deletereservation")
    void DeleteReservation(@RequestBody Reservation r)
    {
        Ser.delete(r);
    }
}
