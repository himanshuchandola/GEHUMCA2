//Name: -Saurabh Suman
//Course: MCA
//UNiversity roll no: -2001135
//Student id: - 20711067

package question2;

class Account
{
    static int count=0;
    int accno;
    double bal;
    String name;
    Account(double bal,String n,int accno)
    {
        System.out.println("\nNew Account opened....!!");
        System.out.println("============================================");

        this.bal=bal;
        count++;
        System.out.println("Account Holder Name : " + n);
        name=n;
        System.out.println("Your Account Number is : "+accno);
        this.accno=accno;
        System.out.println("Total number of accounts : "+count);

    }
    void deposit(double amt)
    {
        System.out.println("----------------------Availabe Balance : ----------------------"+bal);
        System.out.println("============================================");

        bal=bal+amt;
        System.out.println("Rs. : "+amt+" /- Created");
        System.out.println("Balance : "+bal);
    }
    void withdraw(double amt) throws BalanceException
    {
        System.out.println("Availabe Balance :"+bal);
        System.out.println("============================================");

        bal-=amt;
        if(bal<500)
        {
            bal+=amt;
            throw new BalanceException(amt);
        }
        System.out.println("Rs. : "+amt+ "/-Debited");
        System.out.println("Balacne : "+bal);
    }
    void balance()
    {
        System.out.println("\n--------------------Customer information-------------");
        System.out.println("============================================");
        System.out.println("Customer Name : "+name);
        System.out.println("Account Number : "+accno);
        System.out.println("Balance : "+bal);
    }
}