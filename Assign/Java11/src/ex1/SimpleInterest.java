package ex1;

import java.util.Scanner;


@FunctionalInterface
interface Calculation {
	void calc(double amount, int time, double rate);
}


public class SimpleInterest{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter principal amount : ");
        double amount = scanner.nextDouble();
        
        System.out.print("Enter rate of interest : ");
        double interestRate = scanner.nextDouble();
        
        System.out.print("Enter the time : ");
        int time = scanner.nextInt();
        
		// using interface with lambda
        Calculation simpleInterest = (double principalAmount, int timeOfLoan, double rateOfInterest) -> {
        	// calculating simple interest
        	double result = (principalAmount*timeOfLoan*rateOfInterest) / 100 ;
        	System.out.println("The Simple Interest is : "+ result);
        };
        
        simpleInterest.calc(amount, time, interestRate);
        
		scanner.close();
		
	}
}
