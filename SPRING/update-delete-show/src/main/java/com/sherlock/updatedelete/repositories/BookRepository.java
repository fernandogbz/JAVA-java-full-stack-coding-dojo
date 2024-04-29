package com.sherlock.updatedelete.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sherlock.updatedelete.models.Book;

public interface BookRepository extends CrudRepository<Book, Long>{
    List<Book> findAll();
    List<Book> findByDescriptionContaining(String search);
    Long countByTitleContaining(String search);
    Long deleteByTitleStartingWith(String search);
}