package Strings;

public class mylength {
    public static void main(String[] args) {
        String s = new String("Hello World");
        // System.out.println(s.length());

        int len = 0;
        for(char c : s.toCharArray()){
            System.out.println(c);
            len ++ ;
        }
        System.out.println("The length is : "+ len);
    }
    
}
