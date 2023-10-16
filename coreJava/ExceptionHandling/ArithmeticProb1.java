package ExceptionHandling;

import java.util.Scanner;

public class ArithmeticProb1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dividend");
        int num1 = sc.nextInt();
        System.out.println("Enter the divisor");
        int num2 = sc.nextInt();
        try{
            // dividing both the numbers
            double result = num1/num2;
            System.out.println("Result : "+result);
        }catch(ArithmeticException e){
            // catch block for arithmetic exception
            System.out.println("The error is :" + e);
            e.printStackTrace();
        }finally{
            // to print info even if error occurs
            sc.close();
            System.out.println("End of code");
        }

    }
}
