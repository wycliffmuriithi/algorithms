package com.wyki.algorithms.greedy;

import com.wyki.algorithms.sort.BubbleSort;
import org.springframework.stereotype.Service;

/**
 * Class name: TimebasedTODOlist
 * Creater: wgicheru
 * Date:5/28/2019
 * <p>
 * you have exactly T time to do some
 * interesting things and you want to do maximum such things.
 * given an array A of integers, where each element
 * indicates the time a thing takes for completion
 * calculate the maximum number of things that you
 * can do in the limited time that you have
 */
@Service
public class TimebasedTODOlist {
    BubbleSort bubbleSort;

    public TimebasedTODOlist() {

    }

    public TimebasedTODOlist(BubbleSort bubbleSort) {
        this.bubbleSort = bubbleSort;
    }

    /**
     * the itemlist has to be sorted before going through
     * the tasks
     *
     * @param itemlist
     * @param timelimit
     * @return
     */
    public int calculateMostEffective(int[] itemlist, int timelimit) {
        itemlist = bubbleSort.sort(itemlist);
        int itemsdone = 0, timetaken = 0;

        for (int item : itemlist) {
            timetaken += item;
            if (timetaken > timelimit) {
                break;
            }
            itemsdone++;
        }
        return itemsdone;
    }


}
