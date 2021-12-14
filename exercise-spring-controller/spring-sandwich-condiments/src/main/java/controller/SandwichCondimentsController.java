package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class SandwichCondimentsController {
    @GetMapping("/")
        public String getIndex(){
        return "index";
    }

    @GetMapping("/saveCondiment")
    public String save(Model model, @RequestParam("condiment") String[] condiment) {

        model.addAttribute("condiment",condiment);
        return "index";
    }
}
