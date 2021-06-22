//Name: -Saurabh Suman
//Course: MCA
//UNiversity roll no: -2001135
//Student id: - 20711067

package question1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");

        String str = sc.nextLine();
        int length = str.length();

        char ch = str.charAt(0);
        char stfirst =Character.toUpperCase(ch);
        char ch2 = str.charAt(length-1);
        char stlast = Character.toUpperCase(ch2);

        String reverse ="";

        for(int i = length-2;i >0;i--){
            reverse = reverse + str.charAt(i);
        }
        String finalString = stfirst+reverse+stlast;

        System.out.println(finalString);
    }
}
