import java.util.Scanner;  
public class reverse
{

	 public static void main(String[] args) 
	 {

	  String str1 = "Anusthachhetri";
	  String d= "";

	  for (int i = str1.length() - 1; i >= 0; --i) {
	   d += str1.charAt(i);
	  }


	  char[] str=d.toCharArray();
	  for(int i=0;i<d.length();i++)
	     {
	  if(i==0 || str[i-1]==' ')
	     {
	      str[i]=Character.toUpperCase(str[i]);
	     }
	   else if(str[i]==' ' || str[i]=='\0')
	       str[i-1]=Character.toUpperCase(str[i-1]);
	     }
	  System.out.print("After Converting String is: ");
	  for(int i=0;i<d.length();i++)
	  System.out.print(str[i]);
	 	 }
	}