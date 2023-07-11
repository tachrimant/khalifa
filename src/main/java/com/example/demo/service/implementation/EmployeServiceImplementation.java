package com.example.demo.service.implementation;

import java.util.List;

import com.example.demo.dto.EmployeDto;

import com.example.demo.zynerator.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.service.facade.EmployeService;

import com.example.demo.dao.EmployeDao;
import com.example.demo.entities.Employe;

import java.util.Date;

@Service
public class EmployeServiceImplementation implements EmployeService {
    @Autowired
    private EmployeDao employeDao;

    @Override
    public void save(Employe employe) {
        employeDao.save(employe);
    }

    @Override
    public void edit(Employe employe) {
        employeDao.save(employe);
    }

    @Override
    public void deleteById(Long id) {
        employeDao.deleteById(id);
    }

    @Override
    public Employe findById(Long id) {
        return employeDao.findById(id).orElse(null);
    }

    @Override
    public List<Employe> findAll() {
        return employeDao.findAll();
    }

    @Override 
    public List<Employe> findEmployeByCin(String cin){
      return  employeDao.findEmployeByCinLike(cin );
}

        @Override 
    public Employe findEmployeByNom(String nom){
      return  employeDao.findEmployeByNom(nom );
}

        @Override 
    public Employe findEmployeByPrenom(String prenom){
      return  employeDao.findEmployeByPrenom(prenom );
}

        @Override 
    public Employe findEmployeByEmail(String email){
      return  employeDao.findEmployeByEmail(email );
}

        @Override 
    public Employe findEmployeByDatenaissance(Date datenaissance){
      return  employeDao.findEmployeByDatenaissance(datenaissance );
}

}