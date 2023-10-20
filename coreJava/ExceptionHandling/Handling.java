package ExceptionHandling;
// package code;

public class Handling {
    static public void main(String[] args){
        int num1 = 7;
        int num2 = 0;
        int sum = 0;
        try{
            sum = num1/num2;
        }
        catch(Exception e){
            
        }
        finally{
            System.out.println(sum);
        }
    }
}
