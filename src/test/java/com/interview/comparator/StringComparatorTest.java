package com.interview.comparator;

import com.interview.comparators.StringComparator;

import org.junit.Test;

import java.text.ParseException;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class StringComparatorTest {

    @Test
    public void compare_whenGivenTwoString_shouldCompareName() throws ParseException {
        StringComparator StringComparator = new StringComparator();
        String s1="Flora";
        String s2="Flora";
        assertTrue(StringComparator.compare(s1, s2) ==0);
    }

    @Test
    public void compare_whenGivenFirstIsNull_shouldCompareName() throws ParseException {
        StringComparator StringComparator = new StringComparator();
        String s2="Helan";
        assertFalse(StringComparator.compare(null,s2) ==1);
    }


    @Test
    public void compare_whenGivenSecondIsNull_shouldCompareName() throws ParseException {
        StringComparator StringComparator = new StringComparator();
        String s1="Flora";
        assertFalse(StringComparator.compare(s1, null) ==-1);
    }
}
