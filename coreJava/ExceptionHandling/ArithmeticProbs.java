package ExceptionHandling;

import java.util.Scanner;

@FunctionalInterface
interface SimpleInterest{
    void calc();
}

public class ArithmeticProbs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal ammount");
        double p = sc.nextDouble();
        System.out.println("Enter the time");
        double t = sc.nextDouble();
        System.out.println("Enter the rate of interest");
        double r = sc.nextDouble();

        // calculating simple interest
        double res = (p*t*r)/100.0;
        
        /*SimpleInterest si = new SimpleInterest(){
            public void calc(){
                System.out.println("The interest is " + res);
            }
        };*/

        SimpleInterest si = () -> System.out.println("The interest is " + res);
    
        si.calc();
        sc.close();
    }
}