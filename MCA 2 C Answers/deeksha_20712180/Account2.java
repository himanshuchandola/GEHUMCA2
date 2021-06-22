package MyPack;



class LessBalanceException extends Exception
{
	 LessBalanceException(String s){  
		  super(s);  
		 }  

}
class BankAccount2
{

    private String accountNum; // the account number
    private double balance;	   // the amount on deposit

   
    public BankAccount2(String acctNum, double initialBalance)
    {
        accountNum = acctNum;
        balance = initialBalance;
    }

  
    public void deposit(double amount)
    {
        double newBalance = balance + amount;
        balance = newBalance;				// modifies instance var			
    }

   
    public void withdraw(double amount)	throws LessBalanceException
    {
    	if(amount>balance)
    	{
    		throw new LessBalanceException("Withdrawing amount "+amount+" is Not valid");
    	}else {
        double newBalance = balance - amount;
        balance = newBalance;		
    	}
    }

  
    public String getAccount()	
    {
        return accountNum;		// returns value of instance var
    }

   
    public double getBalance()	
    {
        return balance;			// returns value of instance var
    }
}



public class Account2
{

    public static void main(String[] args) throws LessBalanceException
    {
        // create two BankAccount objects
        BankAccount2 first = new BankAccount2("123456678", 500);


        // print initial balances
        System.out.printf("Account %s has initial balance of Rs.-%.2f%n",
                first.getAccount(), first.getBalance());

        
 
       
        try{  
            first.withdraw(1000);  
            }catch(Exception m){System.out.println("Exception occured: "+m);}
        System.out.println("deposited 2000 amount");
        first.deposit(2000);
        System.out.printf("Account %s has new balance of Rs.%.2f%n",
                first.getAccount(), first.getBalance());
        System.out.println("withdrawing 500 amount");
        

       
    }
}
