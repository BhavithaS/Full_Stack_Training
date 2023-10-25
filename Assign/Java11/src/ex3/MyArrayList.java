package ex3;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList {
	public static void main(String[] args) {
		String inputString = "A quick brown fox jumps over the lazy dog";
		// splitting the input string into separate words using split() method
		String[] words = inputString.split(" ");
		
		
		/*for(String i:words) {
			System.out.println(i);
		}*/
		
		// 
		ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(words));
		// converting to array of strings
		
		String[] stringArray = arrayList.toArray(new String[arrayList.size()]);
		
		// printing elements in array
		for(String iString : stringArray) {
			System.out.println(iString);
		}
		
	}      

}
