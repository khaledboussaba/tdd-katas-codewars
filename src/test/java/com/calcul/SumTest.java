package com.calcul;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumTest {

    private Sum sumUnderTest = new Sum();

    @Test
    public void shouldReturnTheSumOfAllNumbersBetweenZeroAndMinusOneIncludingThem() {
        assertEquals(-1, sumUnderTest.getSum(0, -1));
    }

    @Test
    public void shouldReturnTheSumOfAllNumbersBetweenMinusOneAndTwoIncludingThem() {
        assertEquals(2, sumUnderTest.getSum(-1, 2));
    }

    @Test
    public void shouldReturnOneOfTheOfTheTwoGivenIntegersIfTheyAreEquals() {
        assertEquals(1, sumUnderTest.getSum(1, 1));
    }

}