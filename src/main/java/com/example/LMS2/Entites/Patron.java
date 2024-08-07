package com.example.LMS2.Entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Patron")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Patron {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name ="contact_information")
    private String contactInformation;
//    @OneToMany(mappedBy = "patron")
//    private List<BorrowingRecord> borrowingRecords;

}
