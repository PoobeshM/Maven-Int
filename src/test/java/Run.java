package test;

import org.testng.annotations.Test;
import org.testng.Assert;

import claci.Calculator;

public class Run {

    @Test
    public void testAddition() {

        Calculator calc = new Calculator();

        int result = calc.add(2, 3);

        Assert.assertEquals(result, 5);
    }
}