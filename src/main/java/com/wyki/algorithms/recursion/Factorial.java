package com.wyki.algorithms.recursion;

/**
 * Class name: Factorial
 * Creater: wgicheru
 * Date:5/28/2019
 *
 * return the factorial of a given int number
 */
public class Factorial {

    public int getFactorial(int num){
        if(num == 0 || num ==1 ){
            return 1;
        }else{
            return num * getFactorial(num - 1);
        }
    }
}
