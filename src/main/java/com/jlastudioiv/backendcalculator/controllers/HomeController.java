package com.jlastudioiv.backendcalculator.controllers;

import com.jlastudioiv.backendcalculator.helpers.MyMath;
import com.jlastudioiv.backendcalculator.helpers.MyMathComputation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(@RequestParam(value = "numOne", required = false, defaultValue = "0") double numOne,
                        @RequestParam(value = "numTwo", required = false, defaultValue = "0") double numTwo,
                        @RequestParam(value = "operand", required = false, defaultValue = "+") String operand,
                        Model model) {

        System.out.println(numOne);
        System.out.println(numTwo);
        System.out.println(operand);

        MyMathComputation myMathComputation = new MyMathComputation();

        double result = myMathComputation.compute(numOne, numTwo, operand);
        String equation = myMathComputation.printEquation();

        model.addAttribute("result", result);
        model.addAttribute("equation", equation);

        return "index";
    }
}
