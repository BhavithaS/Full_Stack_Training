package StringBuffer;

public class ex2 {
    public static void main(String[] args) {
        String originalString = "It is used to _ at the specified index position";
        String insertText = "insert text";

        int index = originalString.indexOf('_');

        if(index != -1){
            StringBuffer res = new StringBuffer(originalString);
            res.replace(index, index+1, insertText);
            System.out.println(res.toString());
        }

        // if (index != -1) {
        //     StringBuilder result = new StringBuilder(originalString);
        //     result.replace(index, index + 1, insertText);
        //     System.out.println(result.toString());
        // } else {
        //     System.out.println("Insertion point not found in the original string.");
        // }
    }
}
