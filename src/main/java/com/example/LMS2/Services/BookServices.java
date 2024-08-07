package com.example.LMS2.Services;

import com.example.LMS2.Entites.Book;
import com.example.LMS2.Repos.BookRepo;
import com.example.LMS2.exceptions.EmployeeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServices {
  @Autowired
 private BookRepo bookRepo;

  public List<Book>getAllBooks(){

      return bookRepo.findAll();
  }
    public Optional<Book> getBookById(Long id) {
        return Optional.ofNullable(bookRepo.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id)));
    }
    public  Book AddNewBook(Book book){
      return bookRepo.save(book);

    }
    public Book updateBook(Book book)
    {
        bookRepo.findById(book.getId()).orElseThrow(() -> new EmployeeNotFoundException(book.getId()));
        return bookRepo.save(book);

    }
    public void  deleteBook(Long id){
      bookRepo.deleteById(id);

    }



}
