package com.skypro.calculator.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.skypro.calculator.service.Constant.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.*;

public class CalculateServiceParamTest {

//    private static final CalculateService out = new CalculateService();
    @ParameterizedTest
    @MethodSource("provideCalculatedService")
    public void shouldSumCorrectly(Double a, Double b){
        CalculateService out = new CalculateService();
        assertEquals(a + b,out.numPlus(a,b));
    }

    @ParameterizedTest
    @MethodSource("provideCalculatedService")
    public void shouldSubtractCorrectly(Double a, Double b){
        CalculateService out = new CalculateService();
        assertEquals(a - b,out.numMinus(a,b));
    }

    @ParameterizedTest
    @MethodSource("provideCalculatedService")
    public void shouldMultiplyCorrectly(Double a, Double b){
        CalculateService out = new CalculateService();
        assertEquals(a * b,out.numMultiply(a,b));
    }

    @ParameterizedTest
    @MethodSource("provideCalculatedService")
    public void shouldDivideCorrectly(Double a, Double b){
        CalculateService out = new CalculateService();
        assertEquals(a / b,out.numDivide(a,b));
    }
    private static Stream<Arguments> provideCalculatedService(){
      return   Stream.of(
              of(SIX, TWO),
              of(FIVE,ONE),
              of(THREE,FOUR),
              of(SEVEN,FOUR)
      );
    }
}
