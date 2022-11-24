package com.skypro.calculator.controller;

import com.skypro.calculator.service.CalculateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculateController {
    public final CalculateService calculateService;

    public CalculateController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping("/minus")
    public String minusCalculate(@RequestParam("nums1") Double num1, @RequestParam("nums2") Double num2) {
        return generateMessage(num1, num2, "-", calculateService.numMinus(num1, num2));
    }

    @GetMapping("/plus")
    public String plusCalculate(@RequestParam("nums1") Double num1, @RequestParam("nums2") Double num2) {
        return generateMessage(num1, num2, "+", calculateService.numPlus(num1, num2));
    }

    @GetMapping("/multiply")
    public String multiplyCalculate(@RequestParam("nums1") Double num1, @RequestParam("nums2") Double num2) {
        return generateMessage(num1, num2, "*", calculateService.numMultiply(num1, num2));
    }

    @GetMapping("/divide")
    public String divideCalculate(@RequestParam("nums1") Double num1, @RequestParam("nums2") Double num2) {
        return generateMessage(num1, num2, "/", calculateService.numDivide(num1, num2));
    }

    @GetMapping("/")
    public String greeting() {
        return "Добро пожаловать в калькулятор";
    }

    private String generateMessage(Double a, Double b, String operation, Double result) {
        return String.format("%f %s %f = %f", a, operation, b, result);
    }
}
