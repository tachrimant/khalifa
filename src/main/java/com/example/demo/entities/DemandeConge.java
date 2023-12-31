package com.example.demo.entities;

import javax.persistence.*;
import java.util.List;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DemandeConge {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;


    private String libelle;


    private Date dateDebut;


    private Date dateFin;


    private int jourCouvrable;


    @ManyToOne() 
   private  Employe employee;


 private  String etat;


}