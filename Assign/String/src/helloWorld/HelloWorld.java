package helloWorld;

public class HelloWorld {
	public static void main(String[] args) {
        String s = new String("Hello World");
        // length using pre-built method
        System.out.println("Length of string using method " + s.length());

        int len = 0;
        // System.out.println("string in array : " + s.toCharArray());
        for(char c : s.toCharArray()){
            System.out.println(c);
            len ++ ;
        }
        // length without using method
        System.out.println("The length without pre-built method : "+ len);
    }
}
