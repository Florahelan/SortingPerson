package com.interview.comparator;

import com.interview.comparators.DateComparator;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class DateComparatorTest {

    @Test
    public void compare_whenGivenTwoDates_shouldCompareDates() throws ParseException {
        DateComparator dateComparator = new DateComparator();
        SimpleDateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy");
        Date d1 = dateformat.parse("13/06/2017");
        Date d2 = dateformat.parse("25/02/2015");
        assertTrue(dateComparator.compare(d1, d2) > 0);
    }

    @Test
    public void compare_whenFirstDateIsNUll_shouldCompareDates() throws ParseException {
        DateComparator dateComparator = new DateComparator();
        SimpleDateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy");
        Date d1 = dateformat.parse("13/06/2017");
        assertFalse(dateComparator.compare(d1, null) == -1);
    }


    @Test
    public void compare_whenSecondDateIsNUll_shouldCompareDates() throws ParseException {
        DateComparator dateComparator = new DateComparator();
        SimpleDateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy");
        Date d2 = dateformat.parse("13/06/2017");
        assertFalse(dateComparator.compare(null, d2) == 1);
    }
}