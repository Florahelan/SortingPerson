package com.interview.models;

import java.util.*;

/**
 * Person model class which creates a person representation.
 */
public class Person {

    private final String ssn;
    private final Date dateOfBirth;
    private final String firstName;
    private final String lastName;
    private final Double heightIn;
    private final Double weightLb;

    public Person(String ssn, Date dob, String fName, String lName, Double hIn, Double wlb) {
        this.ssn = ssn;
        this.dateOfBirth = dob;
        this.firstName = fName;
        this.lastName = lName;
        this.heightIn = hIn;
        this.weightLb = wlb;
    }

    public String getSsn() {
        return ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Double getHeightIn() {
        return heightIn;
    }

    public Double getWeightLb() {
        return weightLb;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "\n Person {" +
                " FName: " + firstName +
                " LName: " + lastName +
                " DOB: " + dateOfBirth +
                " SSN: " + ssn +
                " Height: " + heightIn +
                " Weight: " + weightLb +
                " } ";
    }

}
