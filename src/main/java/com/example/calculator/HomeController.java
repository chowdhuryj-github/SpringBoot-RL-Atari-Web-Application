package com.example.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // declaring a private attribute
    private final IndexingService indexingService;

    // this is a constructor
    public HomeController(IndexingService indexingService) {
        this.indexingService = indexingService;
    }

    // this is called performing constructor injection
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("indexes", indexingService.getIndex());
        return "index";
    }
}
