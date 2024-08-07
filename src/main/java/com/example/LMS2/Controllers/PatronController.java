package com.example.LMS2.Controllers;

import com.example.LMS2.Entites.Patron;
import com.example.LMS2.Services.PatronServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Patron")
@CrossOrigin(origins = "*")
public class PatronController {
    @Autowired
    private PatronServices patronServices;
@GetMapping
public ResponseEntity<List<Patron>>getAllPatron(){
    return ResponseEntity.ok(patronServices.getAllPatron());
    }
    @GetMapping("{id}")
    public ResponseEntity<?>getPatronById(@PathVariable Long id){
    return ResponseEntity.ok(patronServices.getPatronById(id));
    }
    @PostMapping
    public ResponseEntity<?>addNewPatron(@RequestBody Patron patron){
    return ResponseEntity.ok(patronServices.addNewPatron(patron));
    }
    @PutMapping
    public ResponseEntity<?>updatePatron(@RequestBody Patron patron)
    {
      return ResponseEntity.ok(patronServices.updatePatron(patron));
    }
    @DeleteMapping("{id}")
    public ResponseEntity<?>deletePatron(@PathVariable Long id ){
    patronServices.deletePatron(id);
    return ResponseEntity.ok("Deleted Successfully");
    }
}
