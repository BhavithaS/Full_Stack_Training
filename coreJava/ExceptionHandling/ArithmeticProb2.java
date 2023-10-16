package ExceptionHandling;


public class ArithmeticProb2 {
    public static void main(String[] args) {
        try {
            
            // calling divide method
            int result = divide(45,0);
            // error occurs if divisor is 0
            System.out.println(result);

        } catch (ArithmeticException e) {
            // this executes as Arithmetic Exception is thrown
            System.out.println("Arithmetic Exception occured");
            throw new UnsupportedOperationException("Division by zero is not allowed.", e);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally{
            System.out.println("End of my code");
        }
    }

    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            // throwing new exception
            throw new ArithmeticException("Division by zero is not allowed from method");
        }
        return dividend / divisor;
    }
}
