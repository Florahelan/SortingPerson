package com.interview.comparators;

import com.interview.models.Person;

import java.util.Comparator;

/**
 * Comparator which calls into a field specific comparator based on the field type.
 */
public class FieldComparator implements Comparator<Person> {

	private final String sortField;
	private final DoubleComparator doubleComparator = new DoubleComparator();
	private final StringComparator stringComparator = new StringComparator();
	private final DateComparator dateComparator = new DateComparator();

	public FieldComparator(final String sortField) {
		this.sortField = sortField;
	}

	@Override
	public int compare(Person p1, Person p2) {
		if ("ssn".equalsIgnoreCase(sortField)) {
			return stringComparator.compare(p1.getSsn(), p2.getSsn());
		} else if ("firstName".equalsIgnoreCase(sortField)) {
			return stringComparator.compare(p1.getFirstName(), p2.getFirstName());
		} else if ("lastName".equalsIgnoreCase(sortField)) {
			return stringComparator.compare(p1.getLastName(), p2.getLastName());
		} else if ("heightIn".equalsIgnoreCase(sortField)) {
			return doubleComparator.compare(p1.getHeightIn(), p2.getHeightIn());
		} else if ("weightLb".equalsIgnoreCase(sortField)) {
			return doubleComparator.compare(p1.getWeightLb(), p2.getWeightLb());
		} else if ("dateOfBirth".equalsIgnoreCase(sortField)) {
			return dateComparator.compare(p1.getDateOfBirth(), p2.getDateOfBirth());
		}
		return 0;
	}

}
