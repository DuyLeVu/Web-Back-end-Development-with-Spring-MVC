package com.codegym.controller;

import com.codegym.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/test")
public class DemoController {
    @GetMapping("")
    public String demo(Model model) {
        ArrayList list = new ArrayList();
        list.add("Anh");
        list.add("Ánh");
        list.add("Bình");
        list.add("Long");
        list.add("Khánh");
        model.addAttribute("ds", list);
        return "/demo";
    }
}
