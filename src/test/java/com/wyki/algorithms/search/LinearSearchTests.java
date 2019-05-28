package com.wyki.algorithms.search;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Class name: LinearSearchTests
 * Creater: wgicheru
 * Date:5/28/2019
 */
//@SpringBootTest
//@RunWith(SpringRunner.class)
public class LinearSearchTests {
    LinearSearch linearSearch;
    int searchArray[];

    @Before
    public void initObject(){
        searchArray = new int[5];
        linearSearch = new LinearSearch();
    }

    @Test
    public void linearSearchEmptyArrayTest(){

        assertFalse(linearSearch.linearSearch(1,searchArray));
    }

    @Test
    public void linearSearchMissingNumberTest(){
        for(int i= 0;i<5;i++){
            searchArray[i]=i;
        }
        assertFalse(linearSearch.linearSearch(7,searchArray));
    }

    @Test
    public void linearSearchPresentNumberTest(){
        for(int i= 0;i<5;i++){
            searchArray[i]=i;
        }
        assertTrue(linearSearch.linearSearch(4,searchArray));
    }
}
