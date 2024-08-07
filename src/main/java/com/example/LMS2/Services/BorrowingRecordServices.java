package com.example.LMS2.Services;

import com.example.LMS2.Entites.Book;
import com.example.LMS2.Entites.BorrowingRecord;
import com.example.LMS2.Entites.Patron;
import com.example.LMS2.Repos.BookRepo;
import com.example.LMS2.Repos.BorrowingRepo;
import com.example.LMS2.Repos.PatronRepo;
import com.example.LMS2.exceptions.EmployeeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowingRecordServices {
    @Autowired
     private BookRepo bookRepo;
    @Autowired
    private PatronRepo patronRepo;
    @Autowired
    private BorrowingRepo borrowingRepo;

//    public void AssignPatron(Long BookId,Long PatronId){
//        bookRepo.findById(BookId).orElseThrow(() -> new EmployeeNotFoundException(BookId));
//       patronRepo.findById(PatronId).orElseThrow(() -> new EmployeeNotFoundException(PatronId));
//       borrowingRepo.AssignPatron(BookId, PatronId);
//
//    }
public void AssignPatron(Long BookId,Long PatronId){
   Book book = bookRepo.findById(BookId).orElseThrow(() -> new EmployeeNotFoundException(BookId));
   Patron patron= patronRepo.findById(PatronId).orElseThrow(() -> new EmployeeNotFoundException(PatronId));
    BorrowingRecord borrowingRecord = new BorrowingRecord();
    borrowingRecord.setBook(book);
    borrowingRecord.setPatron(patron);
    borrowingRepo.save(borrowingRecord);

}
}
