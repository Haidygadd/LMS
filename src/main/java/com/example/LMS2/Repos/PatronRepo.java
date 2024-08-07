package com.example.LMS2.Repos;

import com.example.LMS2.Entites.Patron;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatronRepo extends JpaRepository<Patron,Long> {
}
