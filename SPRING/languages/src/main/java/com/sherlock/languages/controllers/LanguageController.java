package com.sherlock.languages.controllers;

import com.sherlock.languages.models.Language;
import com.sherlock.languages.services.LanguageService;

import jakarta.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

 
@Controller
public class LanguageController {
    private final LanguageService languageService;

    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/languages")
    public String index(@ModelAttribute("language") Language language, Model model) {
        model.addAttribute("languages", languageService.allLanguages());
        return "index.jsp";
    }

    @PostMapping("/languages")
    public String createLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result, Model model) {
        if(result.hasErrors()){
            model.addAttribute("languages", languageService.allLanguages());
            return "index.jsp";
        }
        languageService.createLanguage(language);
        return "redirect:/languages";
    }

    @GetMapping("/languages/{id}")
    public String showLanguage(@PathVariable("id") Long id, Model model){
        model.addAttribute("language", languageService.findLanguage(id));
        return "show.jsp";
    }

    @GetMapping("/languages/{id}/edit")
    public String editLanguage(@ModelAttribute("language") Language language, @PathVariable("id") Long id, Model model) {
        model.addAttribute("language", languageService.findLanguage(id));
        return "edit.jsp";
    }
    
    @PutMapping("languages/{id}")
    public String update(@Valid @ModelAttribute("language") Language language,  BindingResult result, @PathVariable("id") Long id) {
        System.out.println("Updating language");
        if(result.hasErrors()){
            System.out.println("Errors");
            return "redirect:/languages/" + id + "/edit";
        }
        languageService.updateLanguage(id, language.getName(), language.getCreator(), language.getCurrentVersion());
        return "redirect:/languages/" + id;        
    }
   
    
    @DeleteMapping("/languages/{id}")
    public String destroy(@PathVariable("id") Long id) {
        languageService.deleteLanguage(id);
        return "redirect:/languages";
    }
}
