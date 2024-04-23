package com.sherlock.enquesta;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "index.jsp";
    }

    @RequestMapping(value = "/result", method = RequestMethod.POST)
    public String result(@RequestParam(value = "name") String name,
        @RequestParam(value = "location") String location, 
        @RequestParam(value = "language") String language,
        @RequestParam(value = "comment") String comment, Model model) {
        
        if(language.equals("Java")){
            return "java.jsp";
        }

        model.addAttribute("name", name);
        model.addAttribute("location", location);
        model.addAttribute("language", language);
        model.addAttribute("comment", comment);


        return "result.jsp";
    }

}
