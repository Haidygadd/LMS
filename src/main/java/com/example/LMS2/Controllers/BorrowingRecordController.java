package com.example.LMS2.Controllers;

import com.example.LMS2.Services.BorrowingRecordServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Borrowing")
@CrossOrigin(origins = "*")
public class BorrowingRecordController {
    @Autowired
    BorrowingRecordServices borrowingRecordServices;
//    @PutMapping("/assign/")
//    public ResponseEntity<?> AssignPatron(@RequestParam Long BookId, @RequestParam Long PatronId){
//        borrowingRecordServices.AssignPatron(BookId,PatronId);
//        return ResponseEntity.ok("ASSIGNED");
//    }
@PutMapping("/assign/")
public ResponseEntity<?> AssignPatron(@RequestParam Long BookId, @RequestParam Long PatronId){
    borrowingRecordServices.AssignPatron(BookId,PatronId);
    return ResponseEntity.ok("ASSIGNED");
}

}
