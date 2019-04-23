package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.codegym.model.Calculator;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("calculator", new Calculator());
        return "home";
    }

    @PostMapping("/isCalculator")
    public ModelAndView isCalculator(@ModelAttribute("calculator") Calculator calculator) {
        /*System.out.println(calculator.getFirstNumber()+"first" + calculator.getSecondeNumber());
        System.out.println(calculator.getOperator());*/



        ModelAndView modelAndView = new ModelAndView("home");

        double firstNumber = calculator.getFirstNumber();
        double secondNumber = calculator.getSecondeNumber();

        String operator = calculator.getOperator();
        switch (operator) {
            case "add": {
                double result = add(firstNumber, secondNumber);
                modelAndView.addObject("result", result);
                break;
            }
            case "sub": {
                double result = sub(firstNumber, secondNumber);
                modelAndView.addObject("result", result);
                break;
            }
            case "multi": {
                double result = multi(firstNumber, secondNumber);
                modelAndView.addObject("result", result);
                break;
            }
            case "div": {
                double result = div(firstNumber, secondNumber);
                modelAndView.addObject("result", result);
                break;
            }
        }
        return modelAndView;
    }

    private double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    private double sub(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    private double multi(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    private double div(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }


}

