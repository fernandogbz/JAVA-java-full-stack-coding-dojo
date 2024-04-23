package com.sherlock.count;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
    @GetMapping("/")
    public String home(HttpSession session) {
        Integer counter = (Integer)session.getAttribute("counter");
        if(counter == null) counter = 0;
        counter++;
        session.setAttribute("counter", counter);
        System.out.println("a");
		return "index.jsp";
	}

    @GetMapping("/counter")
    public String getMethodName(HttpSession session) {
        Integer counter = (Integer)session.getAttribute("counter");
        if(counter == null) counter = 0;
        session.setAttribute("counter", counter);
        return "counter.jsp";
    }
    
}
