package javaPracticle;
class LessBalanceException extends Exception
{
	private static final long serialVersionUID = 1L;
	 LessBalanceException(String s){  
		  super(s);  
		 }  

}
class BankAccount2
{
    // instance variable

    private String accountNum; // the account number
    private double balance;	   // the amount on deposit

    /**
     * Constructs a bank account with an account number and initial balance
     *
     * @param acctNum the account number
     * @param initialBalance the initial balance
     */
    public BankAccount2(String acctNum, double initialBalance)
    {
        accountNum = acctNum;
        balance = initialBalance;
    }

    /**
     * Deposits money into the bank account.
     *
     * @param amount the amount to deposit
     */
    public void deposit(double amount)	// note "mutator" method
    {
        double newBalance = balance + amount;
        balance = newBalance;				// modifies instance var			
    }

    /**
     * Withdraws money from the bank account.
     *
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount)	throws LessBalanceException// note "mutator" method
    {
    	if(amount>balance)
    	{
    		throw new LessBalanceException("Withdrawing amount "+amount+"Not valid");
    	}else {
        double newBalance = balance - amount;
        balance = newBalance;		
    	}
    }

    /**
     * Gets the account number
     *
     * @return the account number
     */
    public String getAccount()	// note "accessor" method
    {
        return accountNum;		// returns value of instance var
    }

    /**
     * Gets the current balance
     *
     * @return the balance
     */
    public double getBalance()	// note "accessor" method
    {
        return balance;			// returns value of instance var
    }
}
//******* end of BankAccount class definition *******

/**
 * A class to test the BankAccount2 class
 */
public class Account2
{

    public static void main(String[] args) throws LessBalanceException
    {
        // create two BankAccount objects
        BankAccount2 first = new BankAccount2("123456678", 500);


        // print initial balances
        System.out.printf("Account %s has initial balance of Rs.-%.2f%n",
                first.getAccount(), first.getBalance());

        
 
        // print new balances
        try{  
            first.withdraw(1000);  
            }catch(Exception m){System.out.println("Exception occured: "+m);}
        System.out.println("deposited 2000 amount");
        first.deposit(2000);
        System.out.printf("Account %s has new balance of Rs.%.2f%n",
                first.getAccount(), first.getBalance());
        System.out.println("withdrawing 500 amount");
        first.deposit(2000);
        first.withdraw(500);
        System.out.printf("Account %s has new balance of Rs.%.2f%n",
                first.getAccount(), first.getBalance());

       
    }
}