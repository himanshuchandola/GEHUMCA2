//Name: -Saurabh Suman
//Course: MCA
//UNiversity roll no: -2001135
//Student id: - 20711067

package question2;

import java.lang.*;
class BalanceException extends Exception
{
    BalanceException(double amt)
    {
        System.out.println("Withdrawing "+amt+" is invlaid");
    }
}

