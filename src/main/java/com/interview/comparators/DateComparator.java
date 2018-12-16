package com.interview.comparators;

import java.util.Comparator;
import java.util.*;

/**
 * Comparator which compares two Dates with null checks.
 */
public class DateComparator implements Comparator<Date> {

    @Override
    public int compare(Date d1, Date d2) {
        if (d1 == null) {
            return -1;
        }
        if (d2 == null) {
            return 1;
        }
        return d1.compareTo(d2);
    }


}
