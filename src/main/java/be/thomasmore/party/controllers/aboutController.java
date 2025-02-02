package be.thomasmore.party.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class aboutController {

    @GetMapping("/about")
    public String about(Model model) {
        String myname="Enes Sarioglu";
        String mystreet= "Oud-Stationsplein ";
        String mycity="Willebroek";
        model.addAttribute("myname",myname);
        model.addAttribute("mystreet",mystreet);
        model.addAttribute("mycity",mycity);
        return "about";

    }
}