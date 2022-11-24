package com.skypro.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculateServiceTest {

   private final CalculateService out = new CalculateService();



   @Test
    void TwoPlusThreeShouldBeFive() {
       CalculateService out = new CalculateService();
       Assertions.assertEquals("3.0 + 4.0 = 7.0",out.numPlus(3D,4D));
    }

    @Test
    void SevenMinusThreeShouldBeFore() {
        CalculateService out = new CalculateService();
        Assertions.assertEquals("7.0 - 3.0 = 4.0",out.numMinus(7D,3D));
    }

    @Test
    void SevenMultiplyThreeShouldBeTwentyOne() {
        CalculateService out = new CalculateService();
        Assertions.assertEquals("7.0 * 3.0 = 21.0",out.numMultiply(7D,3D));
    }

    @Test
    void TenDivideTwoShouldBeFive() {
        CalculateService out = new CalculateService();
        Assertions.assertEquals("10.0 / 2.0 = 5.0",out.numDivide(10D,2D));
    }

    @Test
    void TenDivideZeroShouldBeThrow() {
        CalculateService out = new CalculateService();
        Assertions.assertThrows(IllegalArgumentException.class, () -> out.numDivide(10D,0D));}
    }