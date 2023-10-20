package bank;

public class SavingsAccount {
	private int id;
    private int savings = 0;
    public SavingsAccount(int id, int savings){
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
