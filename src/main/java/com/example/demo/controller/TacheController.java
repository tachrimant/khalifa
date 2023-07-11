package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.dto.TacheDto;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import com.example.demo.service.facade.TacheService;
import com.example.demo.entities.Tache;

@RestController
@RequestMapping("/tache")
public class TacheController {

    @Autowired
    private TacheService tacheService;

    @PostMapping("/")
    public void save(@RequestBody Tache tache) {
        tacheService.save(tache);
    }

    @PutMapping("/")
    public void edit(@RequestBody Tache tache) {
        tacheService.edit(tache);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        tacheService.deleteById(id);
    }

    @GetMapping("/{id}")
    public Tache findById(@PathVariable Long id) {
        return tacheService.findById(id);
    }

    @GetMapping("/")
    public List<Tache> findAll() {
        return tacheService.findAll();
    }
    @GetMapping("/code/{code}")
    public Tache findTacheBycode(@PathVariable String code){
     return  tacheService.findTacheByCode( code );
}

        @GetMapping("/libelle/{libelle}")
    public Tache findTacheBylibelle(@PathVariable String libelle){
     return  tacheService.findTacheByLibelle( libelle );
}

        @GetMapping("/dateDebut/{dateDebut}")
    public Tache findTacheBydateDebut(@PathVariable Date dateDebut){
     return  tacheService.findTacheByDatedebut( dateDebut );
}

        @GetMapping("/dateFin/{dateFin}")
    public Tache findTacheBydateFin(@PathVariable Date dateFin){
     return  tacheService.findTacheByDatefin( dateFin );
}
}