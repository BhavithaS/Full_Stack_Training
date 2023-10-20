package ex1;

public class Ex1 {
	public static void main(String[] args) {
		// With StringBuffer

         StringBuffer stringBuffer = new StringBuffer();
         stringBuffer.append("StringBuffer");
         stringBuffer.append("is a peer class of String");
         stringBuffer.append("that provides much of");
         stringBuffer.append("the functionality of strings");
         System.out.println(stringBuffer.toString());
	}
}
