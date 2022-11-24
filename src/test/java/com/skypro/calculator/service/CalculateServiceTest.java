package com.skypro.calculator.service;

import org.junit.jupiter.api.Test;

import static com.skypro.calculator.service.Constant.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculateServiceTest {

   @Test
    void ThreePlusFourShouldBeSeven() {
       CalculateService out = new CalculateService();
       assertEquals(THREE + FOUR,out.numPlus(THREE,FOUR));
    }

    @Test
    void TwoPlusThreeShouldBeFive() {
        CalculateService out = new CalculateService();
        assertEquals(TWO + THREE,out.numPlus(TWO,THREE));
    }

    @Test
    void SevenMinusThreeShouldBeFore() {
        CalculateService out = new CalculateService();
        assertEquals(SEVEN - THREE,out.numMinus(SEVEN,THREE));
    }

    @Test
    void SevenMinusFiveShouldBeTwo() {
        CalculateService out = new CalculateService();
        assertEquals(SEVEN - FIVE,out.numMinus(SEVEN,FIVE));
    }

    @Test
    void SevenMultiplyThreeShouldBeTwentyOne() {
        CalculateService out = new CalculateService();
        assertEquals(SEVEN * THREE,out.numMultiply(SEVEN,THREE));
    }

    @Test
    void FiveMultiplyThreeShouldBeFifteen() {
        CalculateService out = new CalculateService();
        assertEquals(FIVE * THREE,out.numMultiply(FIVE,THREE));
    }

    @Test
    void SixDivideTwoShouldBeThree() {
        CalculateService out = new CalculateService();
        assertEquals(SIX /TWO,out.numDivide(SIX,TWO));
    }

    @Test
    void TwoDivideOneShouldBeTwo() {
        CalculateService out = new CalculateService();
        assertEquals(TWO /ONE,out.numDivide(TWO,ONE));
    }

    @Test
    void TenDivideZeroShouldBeThrow() {
        CalculateService out = new CalculateService();
        assertThrows(IllegalArgumentException.class, () -> out.numDivide(FIVE,ZERO));}
    }