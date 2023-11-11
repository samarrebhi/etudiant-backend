package samar.steps.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import samar.steps.entities.Bloc;
import samar.steps.services.BlocService;

import java.util.List;

@RestController
@RequestMapping("/blocs")
public class BlocRestcontroller {

    @Autowired
   private BlocService Service;


    @PostMapping("/addbloc")
    public ResponseEntity<String> addbloc(@RequestBody Bloc b){
        Long id=Service.addBloc(b);
        return new ResponseEntity<String>("the bloc'"+id+"' has been added", HttpStatus.OK);
    }

 @GetMapping("/getblocs")
    public ResponseEntity<List<Bloc>> getAllBlocs(){
        List<Bloc> listedesblocs=Service.getAllBloc();
        return new ResponseEntity<List<Bloc>>(listedesblocs,HttpStatus.OK);
 }


}
