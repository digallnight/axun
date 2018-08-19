package com.lqp.axun.intview.algorithm.base;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * Sort Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>$todate</pre>
 */
public class SortTest {

    int[] a = {4, 6, 2, 78, 9, 34, 27, 44, 50, 87};

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: bubbleSort(int a[])
     */
    @Test
    public void testBubbleSort() throws Exception {
        int[] b = Sort.bubbleSort(a);
        for (int i : b) {
            System.out.println(i);
        }
    }

} 
