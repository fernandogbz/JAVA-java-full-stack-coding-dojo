package com.sherlock.dojosninjas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sherlock.dojosninjas.models.Dojo;
import com.sherlock.dojosninjas.models.Ninja;
import com.sherlock.dojosninjas.services.AppService;

import jakarta.validation.Valid;

@Controller
public class AppController {
    private final AppService appService;

    public AppController(AppService appService) {
        this.appService = appService;
    }

    //Dojos
    @GetMapping("/dojos/new")
    public String newDojo(@ModelAttribute("dojo") Dojo dojo){
        return "newDojo.jsp";
    }

    @PostMapping("/dojos/new")
    public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result){
        if(result.hasErrors()){
            return "newDojo.jsp";
        }
        appService.createDojo(dojo);
        return "redirect:/dojos/" + dojo.getId();
    }

    @GetMapping("/dojos/{id}")
    public String showDojo(@PathVariable("id") Long id, Model model){
        model.addAttribute("dojo", appService.findDojoById(id));
        return "showDojo.jsp";
    }

    //Ninjas
    @GetMapping("/ninjas/new")
    public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model){
        model.addAttribute("dojos", appService.getAllDojos());
        return "newNinja.jsp";
    }

    @PostMapping("/ninjas/new")
    public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result){
        if(result.hasErrors()){
            System.out.println("nosucess");
            return "newNinja.jsp";
        }
        System.out.println("suxxcess");
        appService.createNinja(ninja);
        return "redirect:/dojos/" + ninja.getDojo().getId();
    }
}
