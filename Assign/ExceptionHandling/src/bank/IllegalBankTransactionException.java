package bank;

public class IllegalBankTransactionException extends Exception {
	public IllegalBankTransactionException(String msg){
        super(msg);
    }

}
