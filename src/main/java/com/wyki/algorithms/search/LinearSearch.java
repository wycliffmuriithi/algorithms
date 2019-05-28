package com.wyki.algorithms.search;

import org.springframework.stereotype.Service;

/**
 * Class name: LinearSearch
 * Creater: wgicheru
 * Date:5/28/2019
 *
 * this class implements a linearsearch on an array
 * it has a single method which accepts a number and the array to search
 */
@Service
public class LinearSearch {

    public boolean linearSearch(int i, int[] array){
        if(array.length<1){
            return false;
        }else{
            for(int x : array){
                if (i==x){
                    return true;
                }
            }
            return false;
        }
    }
}
