package com.lqp.axun.intview.algorithm.base;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Search Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>$todate</pre>
 */
public class SearchTest {

    int a[] = {1, 2, 3, 4, 5, 6, 8, 9};

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: halfSearch(int[] a, int key, int low, int high)
     */
    @Test
    public void testHalfSearch() throws Exception {
        int key = 99;
        System.out.println(Search.halfSearch(a, key, 0, a.length - 1));
    }

    /**
     * Method: sequenceSearch(int a[], int key)
     */
    @Test
    public void testSequenceSearch() throws Exception {
        int key = 99;
        System.out.println(Search.sequenceSearch(a, key));
    }


} 
