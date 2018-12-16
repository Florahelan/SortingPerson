package com.interview.comparators;

import java.util.*;

/**
 * A comparators for Double type with null checks.
 */
public class DoubleComparator implements Comparator<Double> {

    @Override
    public int compare(Double d1, Double d2) {
        if (d1 == null) {
            return -1;
        }
        if (d2 == null) {
            return 1;
        }
        return Double.compare(d1, d2);
    }
}
