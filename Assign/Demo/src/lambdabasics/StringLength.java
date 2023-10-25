package lambdabasics;

public class StringLength {
	public static void main(String[] args) {
		MyStringLength stringLength = (String s) -> s.length();
		System.out.println(stringLength.getLength("Hello World"));
		
		
		MyStringLength myString = new MyStringLength() {
			
			public int getLength(String s){
					return s.length();
			}
		};
		
		System.out.println(myString.getLength("Hello Worldd"));
	}
	
	interface MyStringLength{
		int getLength(String s);
	}
}
