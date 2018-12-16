package com.interview;

import com.interview.comparators.FieldComparator;
import com.interview.models.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * A Utility class which provides
 * a sorting mechanism for the Person models.
 *
 * The sorting can be done on one of the fields on the models such as
 * firstName, lastName, height, weight, ssn, date of birth.
 */
public final class PersonUtility {

	/**
	 * Sorts the list based on the sortfield and the specified order.
	 *
	 * @param iterator the inout iterator
	 * @param sortField the field to sort on
	 * @param sortOrder "true" if ascending  and "false" if descending
	 * @return the sorted list
	 *
	 * @throws IllegalStateException when the sort field is not one of the fields present in Person.
	 */
	public static List<Person> sort(Iterator<Person> iterator, String sortField, String sortOrder)
	throws IllegalStateException {
		checkSortField(sortField);
		List<Person> personList = new ArrayList<Person>();
		while(iterator.hasNext()) {
			personList.add(iterator.next());
		}

		FieldComparator fieldComparator = new FieldComparator(sortField);
		boolean isAscending = sortOrder.equalsIgnoreCase("true");
		if (isAscending) {
			 Collections.sort(personList, fieldComparator);
        } else {
             Collections.sort(personList, Collections.reverseOrder(fieldComparator));
        }
        return personList;
	}

	private static void checkSortField(String sortField) throws IllegalStateException {
		if(sortField == null || !(sortField.equalsIgnoreCase("firstname")
				|| sortField.equalsIgnoreCase("lastName")
				|| sortField.equalsIgnoreCase("ssn")
				|| sortField.equalsIgnoreCase("dateOfBirth")
				|| sortField.equalsIgnoreCase("heightIn")
				|| sortField.equalsIgnoreCase("weightLb")
		)) {
			throw new IllegalStateException("Illegal arguments passed for sortField : " + sortField);
		}
	}
}
