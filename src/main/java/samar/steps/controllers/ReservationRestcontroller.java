package samar.steps.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import samar.steps.entities.Reservation;
import samar.steps.services.ReservationService;

import java.util.List;

@RestController
@RequestMapping("/reservations")
public class ReservationRestcontroller {
@Autowired
ReservationService Ser;
    @PostMapping("/addreservation")
    Reservation addReservation(@RequestBody Reservation r){
        return Ser.addReservation(r);
    }
@GetMapping("/getallreservations")
    List<Reservation> findAll(){
        List<Reservation> l=Ser.getAllReservations();
        return l;
}
@GetMapping("getbyidreservation")
Reservation getbyIdReservation(@RequestParam("idReservation") String id){
        return Ser.findByIdReservation(id);
}


}
