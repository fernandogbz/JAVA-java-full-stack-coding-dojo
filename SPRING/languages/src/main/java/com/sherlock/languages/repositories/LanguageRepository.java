package com.sherlock.languages.repositories;

import com.sherlock.languages.models.Language;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface LanguageRepository extends CrudRepository<Language, Long>{
    public List<Language> findAll();
}
