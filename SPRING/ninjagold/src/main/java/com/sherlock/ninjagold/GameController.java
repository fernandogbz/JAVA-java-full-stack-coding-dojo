package com.sherlock.ninjagold;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class GameController {
    @GetMapping("/gold")
    public String start(HttpSession session) {
        //Get attributes from session
        Integer gold = (Integer)session.getAttribute("gold");
        gold = gold != null ? gold : 0;
        ArrayList<String> log = (ArrayList<String>)session.getAttribute("log");
        if(log == null) log = new ArrayList<String>();

        session.setAttribute("gold", gold);
        session.setAttribute("log", log);

        return "index.jsp";
    }
    

    @RequestMapping(value="/gold", method=RequestMethod.POST)
    public String update(HttpSession session, @RequestParam(value = "action") String activity) {
        //Get attributes from session
        Integer gold = (Integer)session.getAttribute("gold");
        ArrayList<String> log = (ArrayList<String>)session.getAttribute("log");

        if(activity.equals("reset")) {
            gold = 0;
            log = new ArrayList<String>();
            session.setAttribute("gold", gold);
            session.setAttribute("log", log);
            return "index.jsp";
        }

        Random r = new Random();
        int dGold = 0;
        if(activity.equals("farm")) dGold += r.nextInt(10, 21);
        if(activity.equals("cave")) dGold += r.nextInt(5, 11);
        if(activity.equals("house")) dGold += r.nextInt(2, 6);
        if(activity.equals("casino")) dGold += r.nextInt(-50, 51);
        if(activity.equals("spa")) dGold += r.nextInt(-20, -4);
        gold += dGold;

        if (gold < -100) {
            session.setAttribute("gold", gold);
            session.setAttribute("log", log);
            return "gameover.jsp";           
        }

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String message = "You entered a " + activity + " and " + (dGold > 0 ? "earned " : "lost ") + Math.abs(dGold) + " gold." + (dGold > 0 ? "" : " Ouch..") + " (" + dtf.format(LocalDateTime.now()) + ")";
        log.add(message);
        session.setAttribute("gold", gold);
        session.setAttribute("log", log);

        return "index.jsp";
    }
    
    
    

}
