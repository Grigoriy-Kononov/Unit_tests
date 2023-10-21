package test.hw_3_test;

import main.hw_3.HW3;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class HW3Test {

    //задание 1
    @Test
    public void testEvenNumber() {
        HW3 hw3 = new HW3();
        boolean result = hw3.evenOddNumber(10);
        Assert.assertTrue(result);
    }

    @Test
    public void testOddNumber() {
        HW3 hw3 = new HW3();
        boolean result = hw3.evenOddNumber(7);
        Assert.assertFalse(result);
    }

    @Test
    public void testZero() {
        HW3 hw3 = new HW3();
        boolean result = hw3.evenOddNumber(0);
        Assert.assertTrue(result);
    }

    @Test
    public void testNegativeEvenNumber() {
        HW3 hw3 = new HW3();
        boolean result = hw3.evenOddNumber(-4);
        Assert.assertTrue(result);
    }

    @Test
    public void testNegativeOddNumber() {
        HW3 hw3 = new HW3();
        boolean result = hw3.evenOddNumber(-9);
        Assert.assertFalse(result);
    }

//задание 2
    @Test
    public void testNumberInsideInterval() {
        HW3 hw3 = new HW3();
        boolean result = hw3.numberInInterval(50);
        Assert.assertTrue(result);
    }

    @Test
    public void testNumberBelowInterval() {
        HW3 hw3 = new HW3();
        boolean result = hw3.numberInInterval(10);
        Assert.assertFalse(result);
    }

    @Test
    public void testNumberAboveInterval() {
        HW3 hw3 = new HW3();
        boolean result = hw3.numberInInterval(200);
        Assert.assertFalse(result);
    }

    @Test
    public void testLowerBoundary() {
        HW3 hw3 = new HW3();
        boolean result = hw3.numberInInterval(26);
        Assert.assertTrue(result);
    }

    @Test
    public void testUpperBoundary() {
        HW3 hw3 = new HW3();
        boolean result = hw3.numberInInterval(99);
        Assert.assertTrue(result);
    }

    @Test
    public void testExclusiveLowerBoundary() {
        HW3 hw3 = new HW3();
        boolean result = hw3.numberInInterval(25);
        Assert.assertFalse(result);
    }

    @Test
    public void testExclusiveUpperBoundary() {
        HW3 hw3 = new HW3();
        boolean result = hw3.numberInInterval(100);
        Assert.assertFalse(result);
    }
}
