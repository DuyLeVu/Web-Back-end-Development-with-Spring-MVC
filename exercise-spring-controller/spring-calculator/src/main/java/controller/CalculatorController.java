package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/cal")
    public String Cal(Model model, @RequestParam String number1, String number2, String operator) {
        double num1 = Double.parseDouble(number1);
        double num2 = Double.parseDouble(number2);
        double result = 0;
        switch (operator) {
            case ("add"):
                result = num1 + num2;
                model.addAttribute("result", result);
                break;
            case ("sub"):
                result = num1 - num2;
                model.addAttribute("result", result);
                break;
            case ("mul"):
                result = num1 * num2;
                model.addAttribute("result", result);
                break;
            case ("div"):
                if (num2 == 0)
                    model.addAttribute("result", "Unexpected value");
                else{
                    result = num1 / num2;
                model.addAttribute("result", result);}
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operator);
        }

        return "index";
    }
}
