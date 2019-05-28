package com.wyki.algorithms.sort;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Class name: BubblesortTests
 * Creater: wgicheru
 * Date:5/28/2019
 */
public class BubblesortTests {
    BubbleSort bubbleSort;

    @Before
    public void initObjects() {
        bubbleSort = new BubbleSort();
    }

    @Test
    public void bubblesortTests() {
        int[] unsortedarray = {2, 5, -2, 6, -3, 8, 0, -7, -9, 8};
        int[] sortedarray = bubbleSort.sort(unsortedarray);


        for (int i = 0; i < sortedarray.length; i++) {
            switch (i) {
                case 0:
                    assertEquals(-9,sortedarray[i]);
                    break;
                case 1:
                    assertEquals(-7,sortedarray[i]);
                    break;
                case 2:
                    assertEquals(-3,sortedarray[i]);
                    break;
                case 3:
                    assertEquals(-2,sortedarray[i]);
                    break;
                case 4:
                    assertEquals(0,sortedarray[i]);
                    break;
                case 5:
                    assertEquals(2,sortedarray[i]);
                    break;
                case 6:
                    assertEquals(5,sortedarray[i]);
                    break;
                case 7:
                    assertEquals(6,sortedarray[i]);
                    break;
                case 8:
                    assertEquals(8,sortedarray[i]);
                    break;
                case 9:
                    assertEquals(8,sortedarray[i]);
                    break;
                default:
                    fail("number beyond limit");
                    break;

            }
        }
    }
}
