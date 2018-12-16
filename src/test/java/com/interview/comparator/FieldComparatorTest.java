package com.interview.comparator;

import com.interview.comparators.FieldComparator;
import com.interview.models.Person;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertTrue;


public class FieldComparatorTest {

    @Test
    public void sortFirstName() throws Exception{
        List<Person> testPersonList = createSampleList();
        FieldComparator firstNameComparator = new FieldComparator("firstName");

        Collections.sort(testPersonList, firstNameComparator);
        assertTrue(testPersonList.get(0).getFirstName().equals("Aamya"));
        assertTrue(testPersonList.get(1).getFirstName().equals("Rams"));
        assertTrue(testPersonList.get(2).getFirstName().equals("Zaju"));
    }

    @Test
    public void sortLastName() throws Exception{
        List<Person> testPersonList = createSampleList();
        FieldComparator lastNameComparator = new FieldComparator("lastName");

        Collections.sort(testPersonList, lastNameComparator);
        assertTrue(testPersonList.get(0).getLastName().equals("Auju"));
        assertTrue(testPersonList.get(1).getLastName().equals("Sam"));
        assertTrue(testPersonList.get(2).getLastName().equals("Zuju"));
    }

    @Test
    public void sortSsn() throws Exception{
        List<Person> testPersonList = createSampleList();
        FieldComparator lastNameComparator = new FieldComparator("ssn");

        Collections.sort(testPersonList, lastNameComparator);
        assertTrue(testPersonList.get(0).getSsn().equals("00a-100-3452"));
        assertTrue(testPersonList.get(1).getSsn().equals("00g-100-2786"));
        assertTrue(testPersonList.get(2).getSsn().equals("00z-400-3452"));
    }

    @Test
    public void sortHeightIn() throws Exception{
        List<Person> testPersonList = createSampleList();
        FieldComparator lastNameComparator = new FieldComparator("HeightIn");

        Collections.sort(testPersonList, lastNameComparator);
        assertTrue(testPersonList.get(0).getHeightIn().equals(2.1d));
        assertTrue(testPersonList.get(1).getHeightIn().equals(11.2d));
        assertTrue(testPersonList.get(2).getHeightIn().equals(17.2d));
    }

    @Test
    public void sortWeightLb() throws Exception{
        List<Person> testPersonList = createSampleList();
        FieldComparator lastNameComparator = new FieldComparator("WeightLb");

        Collections.sort(testPersonList, lastNameComparator);
        assertTrue(testPersonList.get(0).getWeightLb().equals(3.4d));
        assertTrue(testPersonList.get(1).getWeightLb().equals(19.4d));
        assertTrue(testPersonList.get(2).getWeightLb().equals(45.4d));
    }

    @Test
    public void sortdateOfBirth() throws Exception{
        List<Person> testPersonList = createSampleList();
        FieldComparator lastNameComparator = new FieldComparator("DateOfBirth");
        Collections.sort(testPersonList, lastNameComparator);
        SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
        assertTrue(testPersonList.get(0).getDateOfBirth().equals(dateformat.parse("25/02/2015")));
        assertTrue(testPersonList.get(1).getDateOfBirth().equals(dateformat.parse("13/06/2017")));
        assertTrue(testPersonList.get(2).getDateOfBirth().equals(dateformat.parse("04/08/2018")));
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
