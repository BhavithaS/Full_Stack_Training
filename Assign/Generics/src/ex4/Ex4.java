package ex4;

public class Ex4 {
	public static void main(String[] args){
        Pair pair1 = new Pair();
        pair1.setKey("1");
        pair1.setValue("Hello");
        System.out.println(" key is : " + pair1.getKey()+ " and value is : " + pair1.getValue());
        
        Pair pair2 = new Pair();
        pair2.setKey("Today is");
        pair2.setValue(new java.util.Date());
        System.out.println(" key is : " + pair2.getKey()+ " and value is : " + pair2.getValue());
        

    }
}
