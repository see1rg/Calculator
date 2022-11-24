package com.skypro.calculator.service;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;


@Service
@SessionScope
public class CalculateService {
    public Double numPlus(Double num1, Double num2) {
        if (num1 == null || num2 == null){
            throw new IllegalArgumentException("Не указан один из параметров.");
        }
        return num1 + num2;
    }

    public Double numMinus(Double num1, Double num2) {
        if (num1 == null || num2 == null){
            throw new IllegalArgumentException("Не указан один из параметров.");
        }
        return num1 - num2;
    }

    public Double numMultiply(Double num1, Double num2) {
        if (num1 == null || num2 == null){
            throw new IllegalArgumentException("Не указан один из параметров.");
        }
        return num1 * num2;
    }

    public Double numDivide(@NotNull Double num1, Double num2) {
        if (num1.isNaN() || num2 == null){
            throw new IllegalArgumentException("Не указан один из параметров.");
        } else if (num2 == 0){
            throw new IllegalArgumentException("Деление на ноль!");
        }
        return num1 / num2;
    }
}
