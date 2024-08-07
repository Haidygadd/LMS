package com.example.LMS2.Repos;

import com.example.LMS2.Entites.BorrowingRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BorrowingRepo extends JpaRepository<BorrowingRecord,Long> {
//@Query(value = "UPDATE Borrowing_Record w SET w.patron_id=:pid WHERE book_id=:bid",nativeQuery = true)
//    void AssignPatron(Long pid,Long bid);
}
