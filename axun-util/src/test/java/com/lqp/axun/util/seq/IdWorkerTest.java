package com.lqp.axun.util.seq;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

/**
 * IdWorker Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>$todate</pre>
 */
public class IdWorkerTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: nextId()
     */
    @Test
    public void testNextId() throws Exception {
        final IdWorker w = new IdWorker(1, 2);
        final CyclicBarrier cdl = new CyclicBarrier(100);

        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        cdl.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                    System.out.println(w.nextId());
                }
            }).start();
        }
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method: tilNextMillis(final long lastTimestamp)
     */
    @Test
    public void testTilNextMillis() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = IdWorker.getClass().getMethod("tilNextMillis", final.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }

    /**
     * Method: timeGen()
     */
    @Test
    public void testTimeGen() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = IdWorker.getClass().getMethod("timeGen"); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }

} 
