package be.thomasmore.party.controllers;

import be.thomasmore.party.model.Venue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VenueController {

    @GetMapping("/venuedetails")
    public String venuedetails(Model model) {
        Venue venue = new Venue();
        venue.setVenueName("De Club");
        venue.setLinkMoreInfo("https://transitm.mechelen.be/de-club/");

        model.addAttribute("venue", venue);
        model.addAttribute("max_persons", 150);
        model.addAttribute("public_transport_distance", "2km van openbaar vervoer");
        model.addAttribute("food_provided", false);
        model.addAttribute("indoor", true);
        model.addAttribute("outdoor", false);
        model.addAttribute("free_parking", true);

        return "venuedetails";
    }
}


