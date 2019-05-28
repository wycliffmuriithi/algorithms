package com.wyki.algorithms.greedy;

import com.wyki.algorithms.sort.BubbleSort;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Class name: TimebasedTODOlistTest
 * Creater: wgicheru
 * Date:5/28/2019
 */
public class TimebasedTODOlistTest {
    TimebasedTODOlist timebasedTODOlist;

    @Before
    public void initObjects(){
        timebasedTODOlist = new TimebasedTODOlist(new BubbleSort());
    }

    @Test
    public void calculateEfficiencyTest(){
        int todolist[] ={5, 3, 4, 2, 1} ,timelimit = 6;

        Assert.assertEquals(3,timebasedTODOlist.calculateMostEffective(todolist,timelimit));
    }
}
