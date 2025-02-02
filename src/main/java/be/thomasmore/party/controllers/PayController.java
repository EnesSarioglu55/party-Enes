package be.thomasmore.party.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller

public class PayController {
    @GetMapping("/pay")
    public String pay(Model model) {
        LocalDate today = LocalDate.now();
        LocalDate dueDate = today.plusDays(30);
        model.addAttribute("today", today);
        model.addAttribute("dueDate", dueDate);
        return "pay";

    }
}