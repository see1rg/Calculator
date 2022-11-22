package com.skypro.calculator.controller;

import com.skypro.calculator.model.Num;
import com.skypro.calculator.service.CalculateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CalculateController {
    public final CalculateService calculateService;

    public CalculateController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping("/calculator/minus")
    public Integer minusCalculate(@RequestParam("nums1") Integer num1, @RequestParam("nums2") Integer num2){
        return this.calculateService.numMinus(num1,num2);
    }

    @GetMapping("/calculator/plus")
    public Integer plusCalculate(@RequestParam("nums1") Integer num1, @RequestParam("nums2") Integer num2){
        return this.calculateService.numPlus(num1,num2);
    }

    @GetMapping("/calculator/check")
    public String hello(){
        return "hello word";
    }
}
