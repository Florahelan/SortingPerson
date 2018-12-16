package com.interview.comparator;

import com.interview.comparators.DoubleComparator;

import org.junit.Test;

import java.text.ParseException;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class DoubleComparatorTest {

    @Test
    public void compare_whenGivenTwoDouble_shouldCompareHeightOrWidth() throws ParseException {
        DoubleComparator doubleComparator = new DoubleComparator();
        Double d1=13.2d;
        Double d2=15.7d;
        assertTrue(doubleComparator.compare(d1, d2) == -1);
    }

    @Test
    public void compare_whenFirstDoubleIsNUll_shouldCompareHeightOrWidth() throws ParseException {
        DoubleComparator doubleComparator = new DoubleComparator();
        Double d2= 15.7d;
        assertFalse(doubleComparator.compare(null, d2) ==1);
    }


    @Test
    public void compare_whenSecondDoubleIsNUll_shouldCompareHeightOrWidth() throws ParseException {
        DoubleComparator doubleComparator = new DoubleComparator();
        Double d1=13.2d;
        assertFalse(doubleComparator.compare(d1,null) ==-1);
    }
}