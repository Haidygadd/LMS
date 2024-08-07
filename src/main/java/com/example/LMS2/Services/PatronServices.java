package com.example.LMS2.Services;

import com.example.LMS2.Entites.Patron;
import com.example.LMS2.Repos.PatronRepo;
import com.example.LMS2.exceptions.EmployeeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatronServices {
    @Autowired
    private PatronRepo patronRepo;

    public List<Patron>getAllPatron(){
        return patronRepo.findAll();
    }
    public Patron getPatronById(Long id){
        return patronRepo.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));
    }
    public Patron addNewPatron(Patron patron){
        return patronRepo.save(patron);
    }
    public Patron updatePatron(Patron patron){
        patronRepo.findById(patron.getId()).orElseThrow(() -> new EmployeeNotFoundException(patron.getId()));
        return patronRepo.save(patron);
    }
public void deletePatron (Long id){
        patronRepo.deleteById(id);
}
}
