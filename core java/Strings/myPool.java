package Assignments.Strings;

public class myPool {
    public static void main(String[] args) {
        String originalString = "Java String pool refers to collection of Strings which are stored in heap memory";

        // a. Print the string in lowercase
        String lowercaseString = originalString.toLowerCase();
        System.out.println("Lowercase: " + lowercaseString);

        // b. Print the string in uppercase
        String uppercaseString = originalString.toUpperCase();
        System.out.println("Uppercase: " + uppercaseString);

        // c. Replace 'a' with $
        String replacedString = originalString.replace('a', '$');
        System.out.println("Replaced: " + replacedString);

        // d. Check if the original string contains "collection"
        boolean containsCollection = originalString.contains("collection");
        System.out.println("Contains 'collection': " + containsCollection);

        // e. Check if another string matches the original
        String compareString = "java string pool refers to collection of strings which are stored in heap memory";
        boolean matches = originalString.equals(compareString);
        System.out.println("Matches original: " + matches);

        // f. Check if the strings are equal (ignoring case)
        boolean equalsIgnoreCase = originalString.equalsIgnoreCase(compareString);
        System.out.println("Equals (ignoring case): " + equalsIgnoreCase);
    }
}
