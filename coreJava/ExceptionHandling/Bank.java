package ExceptionHandling;

class IllegalBankTransactionException extends Exception{
    public IllegalBankTransactionException(String msg){
        super(msg);
    }
}
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class SavingAccount{
    private int id;
    private int savings = 0;
    public SavingAccount(int id, int savings){
        this.id = id;
        this.savings = savings;
    }

    public void getBalance(){
        System.out.println("Your id is : " +id);
        System.out.println("The balance in your acc is :"+ savings);
    }

    public int withdraw(int amount) throws InsufficientBalanceException, IllegalBankTransactionException{
        if(amount<0){
            throw new IllegalBankTransactionException("Amount must be positive");
        }
        if(amount>savings){
            throw new InsufficientBalanceException("Insufficient balance");
        }
        savings -= amount;
        return savings;
    }

    // public void deposit(int amount){
    //     if(amount < 0){
    //         throw new IllegalBankTransactionException("Amount must be positive");
    //     }
    // }

}

public class Bank {
    public static void main(String[] args){
        SavingAccount savingAcc = new SavingAccount(1, 2000);
        try {
            savingAcc.getBalance();
            int amnt1 = savingAcc.withdraw(-450);
            int amnt2 = savingAcc.withdraw(2100);
            int amnt3 = savingAcc.withdraw(500);
            System.out.println("Withdraw amount 1  : "+ amnt1);
            System.out.println("Withdraw amount 2 : "+ amnt2);
            System.out.println("Withdraw amount 3 : "+ amnt3);
            savingAcc.getBalance();
        }catch(InsufficientBalanceException e){
            System.out.println("Error : " + e.getMessage());
        }catch(IllegalBankTransactionException e){
            System.out.println("Error : " + e.getMessage());
        }finally{
            System.out.println("Done withdrawing.....");
        }
        
    }
}
