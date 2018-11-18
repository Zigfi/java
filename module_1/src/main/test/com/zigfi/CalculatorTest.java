package com.zigfi;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        this.calculator = new Calculator();
    }

    @Test
    public void whenAddThenReturnSum() {
        Double result = calculator.add(10.0, 2.5);
        assertThat(12.5, is(result) );
    }

}