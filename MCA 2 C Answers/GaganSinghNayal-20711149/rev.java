package javaPracticle;
import java.util.Scanner;

public class rev {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		System.out.println("reverse of string");
		String str2=str.substring(0,1);
		str2=str2.toUpperCase();
		
		 
		
		System.out.print(str2);
		for(int i=str.length()-2; i>0;i--)
		{
			System.out.print(str.charAt(i));
			
			
		}
		
		String str3=str.substring(str.length()-1,str.length());
		str3=str3.toUpperCase();
		
		System.out.print(str3);
	}
}
