package samar.steps.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import samar.steps.entities.Etudiant;

import samar.steps.services.EtudiantService;

import java.util.List;

@RestController
@RequestMapping("/Etudiants")
public class EtudiantRestcontroller {

    @Autowired
    EtudiantService Service;

    @PostMapping("/addEtudiant")

    public Long addEtudiant(@RequestBody Etudiant e)
    {

            return Service.addEtudiant(e);
        }



    @GetMapping("/getEtudiants")
    public ResponseEntity<List<Etudiant>> getAllEtudiants(){
        List<Etudiant> liste=Service.getAllEtudiants();
        return new ResponseEntity<List<Etudiant>>(liste, HttpStatus.OK);
    }

    @DeleteMapping("/deleteEtudiant")
    public ResponseEntity<String> DeleteById(@RequestBody Long id){

        return new ResponseEntity<String>("étudiant est bien supprimé", HttpStatus.OK);
    }


}
