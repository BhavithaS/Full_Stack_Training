package ex2;

public class Ex2 {

	public static void main(String[] args) {
        String originalString = "It is used to _ at the specified index position";
        String insertText = "insert text";

        int index = originalString.indexOf('_');

        // With StringBuffer

        if(index != -1){
            StringBuffer res = new StringBuffer(originalString);
            // replacing '_'with 'insert text' by using replace method
            res.replace(index, index+1, insertText);
            System.out.println(res.toString());
        }else {
            System.out.println("Insertion point not found in the original string.");
        }

    }

}
