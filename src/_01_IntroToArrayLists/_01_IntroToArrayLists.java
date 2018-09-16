package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		ArrayList<String> str = new ArrayList<String>();
		//   Don't forget to import the ArrayList class

		//2. Add five Strings to your list
		str.add("a");
		str.add("b");
		str.add("c");
		str.add("d");
		str.add("e");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < str.size(); i++) {
			System.out.println("String at element " + i + " is " + str.get(i));
		}
		
		//4. Print all the Strings using a for-each loop
		for(String s : str) {
			System.out.println(s);
		}
		//5. Print only the even numbered elements in the list.
		
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
