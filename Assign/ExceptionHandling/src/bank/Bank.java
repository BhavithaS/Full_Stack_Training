package bank;

public class Bank {

	public static void main(String[] args) {
		SavingsAccount savingAcc = new SavingsAccount(1, 2000);
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
