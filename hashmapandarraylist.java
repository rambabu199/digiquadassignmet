// Java Program to Iterate over HashMap

// Importing Map and HashMap classes
// from package names java.util
import java.util.*;

// Class for iterating HashMap and arraylist  using for loop
public class hashmapandarraylist {

	// Main driver method
	public static void main(String[] args)
	{
		// Creating a HashMap
		Map<String, String> foodTable= new HashMap<String, String>();

		// Inserting elements to the adobe HashMap
		// Elements- Key value pairs using put() method
		foodTable.put("A", "Angular");
		foodTable.put("J", "Java");
		foodTable.put("P", "Python");
		foodTable.put("H", "Hibernate");

		// Iterating HashMap through for loop
		for (Map.Entry<String, String> set :
			foodTable.entrySet()) {

		// Printing all elements of a Map
		System.out.println(set.getKey() + " = "+ set.getValue());
                }

		 // Creating and initializing the ArrayList
                // Declaring object of integer type
                List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
                // Iterating using for loop
              for (int i = 0; i < numbers.size(); i++)
		{
                // Printing and display the elements in ArrayList
               System.out.print(numbers.get(i) + " "); 
		}
	}
}
