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

    @DeleteMapping("/deleteEtudiant/{id}")
    String DeleteEtudiantByID(@PathVariable("id") long id){
        Service.deleteById(id);
        return "student deleted";
    }

    @GetMapping("/getEtudiants")
    public ResponseEntity<List<Etudiant>> getAllEtudiants(){
        List<Etudiant> liste=Service.getAllEtudiants();
        return new ResponseEntity<List<Etudiant>>(liste, HttpStatus.OK);
    }

    @PutMapping("updateEtudiant")
    Etudiant updateEtudiant(@RequestBody Etudiant e){
        return  Service.editEtudiant(e);
    }





}
