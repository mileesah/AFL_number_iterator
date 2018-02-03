package au.com.afl.exercise.service.impl;


import au.com.afl.exercise.service.Iterator;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DefaultIteratorTest {


    @Test
    public void testEmptyCollection(){
        Iterator iterator  = new DefaultIterator(new ArrayList());
        Assert.assertFalse(iterator.hasNext());
    }

    @Test
    public void testCollection(){
        List testList = Arrays.asList("test","1","2" );

        Iterator iterator  = new DefaultIterator(testList);

        for (int i = 0; i < 3; i++) {
            Assert.assertTrue(iterator.hasNext());
            String item = (String) iterator.next();
            Assert.assertEquals(testList.get(i), item);
        }
    }


}
