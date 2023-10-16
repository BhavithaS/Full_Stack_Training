package ExceptionHandling;

import java.util.Scanner;

public class ArithmeticProb2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the first number: ");
            double dividend = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double divisor = scanner.nextDouble();

            double result = divideNumbers(dividend, divisor);
            System.out.println("Result of the division: " + result);
        } catch (ArithmeticException e) {
            throw new UnsupportedOperationException("Division by zero is not allowed.", e);
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close(); // Close the scanner in the finally block.
        }
    }

    public static double divideNumbers(double dividend, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return dividend / divisor;
    }
}
