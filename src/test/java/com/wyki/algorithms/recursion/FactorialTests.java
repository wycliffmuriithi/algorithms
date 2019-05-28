package com.wyki.algorithms.recursion;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Class name: FactorialTests
 * Creater: wgicheru
 * Date:5/28/2019
 */
public class FactorialTests {
    Factorial factorial;

    @Before
    public void initObjects(){
        factorial = new Factorial();
    }

    @Test
    public void factorialTest(){
        assertEquals(2,factorial.getFactorial(2));
        assertEquals(6,factorial.getFactorial(3));
        assertEquals(120,factorial.getFactorial(5));
        assertEquals(3628800,factorial.getFactorial(10));
    }
}
