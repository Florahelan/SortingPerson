package com.interview;

import com.interview.models.Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * A sample Runner to demo the working of the PersonSort Class.
 */
public class SampleRunner {

    public static void main(String args[]) throws ParseException {
        List<Person> personArrayList = new ArrayList<Person>();
        SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
        personArrayList.add(new Person("z1001", dateformat.parse("13/06/2017"), "Rams", "Sam", 11.2d, 45.4d));
        personArrayList.add(new Person("g1002", dateformat.parse("25/02/2015"), "Zaju", "Auju", 2.1d, 19.4d));
        personArrayList.add(new Person("a1003", dateformat.parse("04/08/2018"), "Aamya", "Zuju", 17.2d, 3.4d));

        System.out.println("\n"+"Before Sorting " + personArrayList + "\n");
        System.out.println("After Sorting " + PersonUtility.sort(personArrayList.iterator(), "weightLb", "false"));
    }
}
