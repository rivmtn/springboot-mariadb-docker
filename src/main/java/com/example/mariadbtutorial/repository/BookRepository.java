package com.example.mariadbtutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mariadbtutorial.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
