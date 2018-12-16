# Sorting Person

The idea behind this project is to sort the person details based on the given field and order.

##Build and Running the Project

The project uses maven as a distribution and package management system.

To install and run the project please do the following steps

### Clean

```
mvn clean
```

### Build the package

```
mvn package
```

### Run the jar artifact created

```
java -jar target/interview-1.0.jar
```

### Tests

To run only the tests use the following command

```
mvn test
```

### Main Class : Runner

The Runner is a demo class which demonstrates the sorting with predefined list 
list,   

```
        List<Person> personArrayList = new ArrayList<Person>();
        SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
        personArrayList.add(new Person("z1001", dateformat.parse("13/06/2017"), "Rams", "Sam", 11.2d, 45.4d));
        personArrayList.add(new Person("g1002", dateformat.parse("25/02/2015"), "Zaju", "Auju", 2.1d, 19.4d));
        personArrayList.add(new Person("a1003", dateformat.parse("04/08/2018"), "Aamya", "Zuju", 17.2d, 3.4d));

        System.out.println("\n"+"Before Sorting " + personArrayList + "\n");
        System.out.println("After Sorting " + PersonUtility.sort(personArrayList.iterator(), "weightLb", "false"));

```
Edit this class for different runs. 
 
## Trade-offs


Initially, I had a thought of using Quicksort or Mergesort for sorting the fields. Since its time complexity is (O(n(logn)).  

I weighted against Collections.Sort Since its time complexity is also O(n(logn)) (which uses Merge sort in-build for sorting). So, I preferred to use Collections.sort.

Additionally, I have created three comparators of the different datatype. In the future, if there are additional filed other than String, Double, and Date, then the logic has to be changed to sort the new comparator.