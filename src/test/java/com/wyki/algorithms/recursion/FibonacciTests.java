package com.wyki.algorithms.recursion;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Class name: FibonacciTests
 * Creater: wgicheru
 * Date:5/28/2019
 */
public class FibonacciTests {
    Fibonacci fibonacci;

    @Before
    public  void initObjects(){
        fibonacci = new Fibonacci();
    }

    @Test
    public void testWithLengthTwo(){
        assertEquals(1,fibonacci.fibonacciSeries(2));
    }

    @Test
    public void testWithLengthFive(){
        assertEquals(5,fibonacci.fibonacciSeries(5));
    }

    @Test
    public void testWithLengthEigth(){
        assertEquals(21,fibonacci.fibonacciSeries(8));
    }
}
