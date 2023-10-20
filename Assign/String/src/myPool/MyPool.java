package myPool;

public class MyPool {

	public static void main(String[] args) {
		
		String originalString = "Java String pool refers to collection of Strings which are stored in heap memory";

        // lowercase
        String lowercaseString = originalString.toLowerCase();
        System.out.println("Lowercase: " + lowercaseString);

        // uppercase
        String uppercaseString = originalString.toUpperCase();
        System.out.println("Uppercase: " + uppercaseString);

        // Replacing 'a' with $
        String replacedString = originalString.replace('a', '$');
        System.out.println("Replaced: " + replacedString);

        // checking if the original string contains "collection"
        boolean containsCollection = originalString.contains("collection");
        System.out.println("Is 'collection' present? : " + containsCollection);

        // Checking if another string matches the original
        String compareString = "java string pool refers to collection of strings which are stored in heap memory";
        boolean matches = originalString.equals(compareString);
        System.out.println("Matches original: " + matches);

        // Checking if the strings are equal with equalsIgnoreCase()
        boolean equalsIgnoreCase = originalString.equalsIgnoreCase(compareString);
        System.out.println("Equals (ignoring case): " + equalsIgnoreCase);

	}

}
