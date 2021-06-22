import java.util.Scanner;
import java.io.*;

public class HelloWorld{

     public static void main(String []args){
        System.out.println("Enter the string : ");
        Scanner myObj = new Scanner(System.in);
        String s = myObj.nextLine();

        for(int i=0; i<s.length(); i++ ){
            if(i==0 || i==s.length() -1 ){
                System.out.print( Character.toUpperCase( s.charAt(i) ) );
            }
            else{
                System.out.print( s.charAt( s.length() -1 - i) );
            }
        }
     }
}
