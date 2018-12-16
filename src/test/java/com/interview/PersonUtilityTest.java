package com.interview;

import com.interview.models.Person;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class PersonUtilityTest {

    @Test
    public void sortAscendingList() throws ParseException {
        List<Person> testPersonList = createSampleList();
        List<Person> resultList = PersonUtility.sort(testPersonList.iterator(),
                "firstName", "true");

        assertTrue(resultList.get(0).getFirstName().equals("Aamya"));
        assertTrue(resultList.get(1).getFirstName().equals("Rams"));
        assertTrue(resultList.get(2).getFirstName().equals("Zaju"));
    }

    @Test
    public void sortDescendingList() throws ParseException {
        List<Person> testPersonList = createSampleList();
        List<Person> resultList = PersonUtility.sort(testPersonList.iterator(),
                "firstName", "false");

        assertTrue(resultList.get(0).getFirstName().equals("Zaju"));
        assertTrue(resultList.get(1).getFirstName().equals("Rams"));
        assertTrue(resultList.get(2).getFirstName().equals("Aamya"));
    }

    @Test
    public void sortWithIllegalFields() throws ParseException {
        List<Person> testPersonList = createSampleList();
     try {
         PersonUtility.sort(testPersonList.iterator(),
                 "illegal", "true");
     } catch (IllegalStateException stateExc) {
         assertTrue(stateExc.getMessage().equals("Illegal arguments passed for sortField : illegal"));
     }
    }

    private List<Person> createSampleList() throws ParseException {
        List<Person> sampleList = new ArrayList<Person>();
        SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
        Date d1= dateformat.parse("13/06/2017");
        Date d2= dateformat.parse("25/02/2015");
        Date d3= dateformat.parse("04/08/2018");

        sampleList.add(new Person("00z-400-3452",d1,"Rams","Sam", 11.2d, 45.4d));
        sampleList.add(new Person("00g-100-2786",d2,"Zaju","Auju", 2.1d, 19.4d));
        sampleList.add(new Person("00a-100-3452",d3,"Aamya","Zuju", 17.2d, 3.4d));
        return sampleList;
    }
}
