package StringBuffer;

public class ex3 {
    public static void main(String[] args){

        // With StringBuffer
        
        // StringBuffer stringBuffer = new StringBuffer("This method returns the reversed object on which it was called");
        // System.out.println("String is : " + stringBuffer);
        // System.out.println("Reversed string is : " + stringBuffer.reverse());

        // With StringBuilder

        StringBuilder stringBuffer = new StringBuilder("This method returns the reversed object on which it was called");
        System.out.println("String is : " + stringBuffer);
        //reversing the string using reverse in stringbuffer
        System.out.println("Reversed string is : " + stringBuffer.reverse());
    }
}
