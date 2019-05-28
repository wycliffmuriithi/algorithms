package com.wyki.algorithms.sort;

import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * Class name: BubbleSort
 * Creater: wgicheru
 * Date:5/28/2019
 * <p>
 * Bubble sort is based on the idea of
 * repeatedly comparing pairs of
 * adjacent elements and then swapping
 * their positions if they exist in the wrong order
 */
@Service
public class BubbleSort {

    public int[] sort(int[] unsortedarray) {
        int length = unsortedarray.length;
        int tempcontainer = 0;

        //the two for loops ensure that there are two adjacent integers to compare
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < (length - i); j++) {
                //note that j-1 makes sure we have the same number
                if(unsortedarray[j-1]>unsortedarray[j]){
                    tempcontainer = unsortedarray[j-1];
                    unsortedarray[j-1]=unsortedarray[j];
                    unsortedarray[j]=tempcontainer;
                }
            }
        }
        return unsortedarray;
    }
}
