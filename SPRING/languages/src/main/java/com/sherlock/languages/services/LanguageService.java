package com.sherlock.languages.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sherlock.languages.models.Language;
import com.sherlock.languages.repositories.LanguageRepository;


@Service
public class LanguageService {
    private final LanguageRepository languageRepositories;

    public LanguageService(LanguageRepository languageRepositories) {
        this.languageRepositories = languageRepositories;
    }

    public Language createLanguage(Language language) {
        return languageRepositories.save(language);
    }   

    public List<Language> allLanguages() {
        return languageRepositories.findAll();
    }

    public Language findLanguage(Long id) {
        Optional<Language> language = languageRepositories.findById(id);
        if(language.isPresent()) {
            return language.get();
        } else {
            return null;
        }
    }

    public Language updateLanguage(Long id, String name, String creator, String currentVersion) {
        Optional<Language> language = languageRepositories.findById(id);
        if(language.isPresent()) {
            language.get().setName(name);
            language.get().setCreator(creator);
            language.get().setCurrentVersion(currentVersion);
            return languageRepositories.save(language.get());
        } else {
            return null;
        }
    }

    public void deleteLanguage(Long id) {
        if(languageRepositories.existsById(id)){
            languageRepositories.deleteById(id);
        }
    }

}
