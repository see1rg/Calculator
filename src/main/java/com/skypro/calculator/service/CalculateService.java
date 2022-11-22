package com.skypro.calculator.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;


@Service
@SessionScope
public class CalculateService {
    public Integer numPlus(Integer num1, Integer num2) {
        return num1 + num2;
    }

    public Integer numMinus(Integer num1, Integer num2) {
        return num1 - num2;
    }

}
