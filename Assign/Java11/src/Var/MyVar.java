package Var;

public class MyVar {
	    public static void main(String[] args){
	        var a = 100;  // local declaration 
	        var b = 10.0;
	        var c = 'a';
	        var d = "Hello";
	        var e = false;
	        System.out.println("a : "+a+ " b : "+b+" c : "+ c + " d : " + d + " e : " + e);

	        /*  ERROR CODES

	        1. Cannot be used as instance variable
	        2. Cannot be used as generic type like this <>
	        3. CAnnot be used without declaration
	        4. Cannot be used with lambda expressions
	        5. Cannot be used in method parameters and return type


	        */
	    }


}
