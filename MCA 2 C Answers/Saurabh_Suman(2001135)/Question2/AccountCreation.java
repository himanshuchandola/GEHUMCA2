//Name: -Saurabh Suman
//Course: MCA
//UNiversity roll no: -2001135
//Student id: - 20711067

package question2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class AccountCreation
{
    static int i=0;
    public static void main(String [] args) throws IOException
    {
        Account []ob=new Account[10];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        double amt;
        String name;
        int ch,accno,k;
        boolean t=false;
        while(true)
        {
            System.out.println("\n******* Bank Transaction *********");
            System.out.println("1.Open new Account");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Balance");
            System.out.println("5.Exit");
            System.out.print("Enter your choice : ");
            ch=Integer.parseInt(br.readLine());
            switch(ch)
            {
                case 1:
                    System.out.println("Opening New Account : ");
                    System.out.print("Enter your name : ");
                    name=br.readLine();
                    System.out.print("\nEnter Account Number : ");
                    accno=Integer.parseInt(br.readLine());
                    System.out.print("\nEnter initial amount(should be more than 500) : ");
                    amt=Double.parseDouble(br.readLine());
                    if(amt<500)
                        System.out.println("You cannot create an account with less than Rs.500/-");
                    else
                    {
                        ob[i]=new Account(amt,name,accno);
                        i++;
                    }
                    break;

                case 2:
                    System.out.print("\nEnter Account number : ");
                    accno=Integer.parseInt(br.readLine());
                    for(k=0;k<i;k++)
                        if(accno==ob[k].accno)
                        {
                            t=true;
                            break;
                        }

                    if(t)
                    {
                        System.out.print("\nEnter the Amount for Deposit : ");
                        amt=Double.parseDouble(br.readLine());
                        ob[k].deposit(amt);
                    }
                    else
                        System.out.println("Invalid Account Number...!!!");
                    t=false;
                    break;

                case 3:
                    System.out.print("\nEnter Account number : ");
                    accno=Integer.parseInt(br.readLine());
                    for(k=0;k<i;k++)
                        if(accno==ob[k].accno)
                        {
                            t=true;
                            break;
                        }

                    if(t)
                    {
                        System.out.print("\nEnter the Amount for Withdraw : ");
                        amt=Double.parseDouble(br.readLine());
                        try
                        {
                            ob[k].withdraw(amt);
                        }
                        catch(BalanceException e)
                        {}
                    }
                    else
                        System.out.println("Invalid Account Number...!!!");
                    t=false;
                    break;

                case 4:
                    System.out.print("\nEnter Account number : ");
                    accno=Integer.parseInt(br.readLine());
                    for(k=0;k<i;k++)
                        if(accno==ob[k].accno)
                        {
                            t=true;
                            break;
                        }

                    if(t)
                    {
                        ob[k].balance();
                    }
                    else
                        System.out.println("Invalid Account Number...!!!");
                    t=false;
                    break;

                case 5:
                    System.exit(1);
                default: System.out.println("Invalid Choice !!!");
            }
        }
    }
}

