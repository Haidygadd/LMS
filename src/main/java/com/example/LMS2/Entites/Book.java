package com.example.LMS2.Entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Book")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id ;
    @Column(name = "title")
    private String title;
    @Column(name = "author")
    private  String author;
    @Column(name = "publication_year")
    private int publicationYear;
    @Column(name = "isbn")
    private String isbn;

//    @OneToMany(mappedBy = "book")
//    private List<BorrowingRecord> borrowingRecords;

}
