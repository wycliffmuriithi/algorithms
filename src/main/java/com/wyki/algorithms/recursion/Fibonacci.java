package com.wyki.algorithms.recursion;

import org.springframework.stereotype.Service;

/**
 * Class name: Fibonacci
 * Creater: wgicheru
 * Date:5/28/2019
 * <p>
 * this is a sum series, the objective is to generate
 * the sum of a given length of the series
 */
@Service
public class Fibonacci {

    public int fibonacciSeries(int length) {
        if (length == 0) {
            return 0;
        } else if (length == 1 || length == 2) {
            return 1;
        }else{
            return fibonacciSeries(length-2) + fibonacciSeries(length - 1);
        }
    }
}
