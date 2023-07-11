package com.example.demo.dto;

import java.util.List;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TacheDto {
    private Long id;
    private String code;


    private String libelle;


    private Date dateDebut;


    private Date dateFin;


    private ProjetDto projetDto;


    private EmployeDto employeDto;


}