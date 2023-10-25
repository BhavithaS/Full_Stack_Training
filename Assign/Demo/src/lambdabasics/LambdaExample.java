package lambdabasics;


public class LambdaExample {
	public static void main(String[] args) {
		// calling a greet method
		greet();
		
		// lambda expression to define function
		// you've to define the type of the lambda by creating an interface
		// the interface can only have one method***
		// i.e. it should be a functional interface
		// You can call lambda expressions by calling interface method in it, as if it were an instance of class
		
		MyGreet greetingVariable = () -> System.out.println("Hello World");
		greetingVariable.mygreet();
		
		
		
//		numberFunction = (int a) -> a*2;
//		
		MyAdd addFunction = (int a, int b) -> a + b ;
//		
//		divideFunction = (int a,int b) {
//			if (b==0) return 0;
//			return a/b;
//		}
//		
//		lengthFunction = (String s) -> s.length();
		
		
		
	}
	
	static void greet() {
		System.out.println("Hello World");
	}
	
}

interface MyGreet{
	void mygreet();
}

interface MyAdd{
	int add(int a,int b);
}
