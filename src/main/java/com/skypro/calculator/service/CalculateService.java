package com.skypro.calculator.service;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;


@Service
@SessionScope
public class CalculateService {
    public String numPlus(Double num1, Double num2) {
        if (num1 == null || num2 == null){
            throw new IllegalArgumentException("Не указан один из параметров.");
        }
        Double sum = num1 + num2;
        String result = num1 + " + " + num2 + " = " + sum ;
        return result;
    }

    public String numMinus(Double num1, Double num2) {
        if (num1 == null || num2 == null){
            throw new IllegalArgumentException("Не указан один из параметров.");
        }
        Double sum = num1 - num2;
        String result = num1 + " - " + num2 + " = " + sum ;
        return result;
    }

    public String numMultiply(Double num1, Double num2) {
        if (num1 == null || num2 == null){
            throw new IllegalArgumentException("Не указан один из параметров.");
        }
        Double sum = num1 * num2;
        String result = num1 + " * " + num2 + " = " + sum ;
        return result;
    }

    public String numDivide(@NotNull Double num1, Double num2) {
        if (num1.isNaN() || num2 == null){
            throw new IllegalArgumentException("Не указан один из параметров.");
        } else if (num2 == 0){
            throw new IllegalArgumentException("Деление на ноль!");
        }
        Double sum = num1 / num2;
        String result = num1 + " / " + num2 + " = " + sum ;
        return result;
    }
}
