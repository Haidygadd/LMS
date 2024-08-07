package com.example.LMS2.Controllers;

import com.example.LMS2.Entites.Book;
import com.example.LMS2.Repos.BookRepo;
import com.example.LMS2.Services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Book")
@CrossOrigin(origins = "*")
public class BookController {
    @Autowired
 private BookServices bookServices;
  @GetMapping
    public ResponseEntity<List<Book>>getAllBooks(){

      return ResponseEntity.ok(bookServices.getAllBooks());
  }
  @GetMapping("{id}")
  public ResponseEntity<?> getBookById(@PathVariable Long id) {
      return ResponseEntity.ok(bookServices.getBookById(id));
  }
  @PostMapping()
    public ResponseEntity<?>addNewBook(@RequestBody Book book){
      return ResponseEntity.ok(bookServices.AddNewBook(book));
  }
  @PutMapping
  public ResponseEntity<?>updateBook(@RequestBody Book book){
      return ResponseEntity.ok(bookServices.updateBook(book));
  }
  @DeleteMapping("{id}")
    public ResponseEntity<?>deleteBook(@PathVariable Long id){
      bookServices.deleteBook(id);
      return ResponseEntity.ok("Deleted Successfully ");

  }


}
