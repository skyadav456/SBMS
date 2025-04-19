package com.sharad.main;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Default test
     */
    public void testApp() {
        assertTrue(true);
    }

    // Your custom method to be tested
    public int sum(int a, int b) {
        return a + b;
    }

    public void testPositiveNumbers() {
        int actual = sum(3, 4);
        int expected = 7;
        assertEquals(expected, actual);
    }

    public void testNegativeNumbers() {
        int actual = sum(-3, -4);
        int expected = -7;
        assertEquals(expected, actual);
    }

    public void testPositiveAndNegative() {
        int actual = sum(5, -4);
        int expected = 1;
        assertEquals(expected, actual);
    }

    public void testZeroAndPositive() {
        int actual = sum(0, 7);
        int expected = 7;
        assertEquals(expected, actual);
    }

    public void testZeroAndNegative() {
        int actual = sum(0, -5);
        int expected = -5;
        assertEquals(expected, actual);
    }

    public void testWithZero() {
        int actual = sum(0, 0);
        int expected = 0;
        assertEquals(expected, actual);
    }

    public void testSamePositiveNumbers() {
        int actual = sum(5, 5);
        int expected = 10;
        assertEquals(expected, actual);
    }

    public void testSameNegativeNumbers() {
        int actual = sum(-5, -5);
        int expected = -10;
        assertEquals(expected, actual);
    }

    public void testWithMaxInt() {
        int actual = sum(Integer.MAX_VALUE, 0);
        int expected = Integer.MAX_VALUE;
        assertEquals(expected, actual);
    }

    public void testWithMinInt() {
        int actual = sum(Integer.MIN_VALUE, 0);
        int expected = Integer.MIN_VALUE;
        assertEquals(expected, actual);
    }

    public void testOverflow() {
        int actual = sum(Integer.MAX_VALUE, 1);
        int expected = Integer.MIN_VALUE; // Overflow wraps around
        assertEquals(expected, actual);
    }

    public void testUnderflow() {
        int actual = sum(Integer.MIN_VALUE, -1);
        int expected = Integer.MAX_VALUE; // Underflow wraps around
        assertEquals(expected, actual);
    }
}
