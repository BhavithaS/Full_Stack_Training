package ex3;

public class Ex3 {
	public static void main(String[] args) {
		// With StringBuilder

        StringBuilder stringBuffer = new StringBuilder("This method returns the reversed object on which it was called");
        System.out.println("String is : " + stringBuffer);
        //reversing the string using reverse in stringbuffer
        System.out.println("Reversed string is : " + stringBuffer.reverse());
	}
}
