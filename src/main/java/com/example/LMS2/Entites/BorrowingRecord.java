package com.example.LMS2.Entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Borrowing_Record")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class BorrowingRecord {
    @Id
    @Column(name = "BorrowingRecordId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
   @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
    @ManyToOne
    @JoinColumn(name = "patron_id")
    private  Patron patron;

}
