import java.util.Scanner;  
public class Reverse
{

	 public static void main(String[] args) 
	 {

	  Scanner s=new Scanner(System.in);
          System.out.println("enter the string : ");
           String str1=s.nextLine();
	  String d= "";

	  for (int i = str1.length() - 1; i >= 0; --i) {
	   d += str1.charAt(i);
	  }


	  char[] ch = d.toCharArray();
      for (int i = 0; i < ch.length; i++) {
          int k = i;
          while (i < ch.length && ch[i] != ' ')
              i++;
          ch[k] = (char)(ch[k] >= 'a' && ch[k] <= 'z'
                             ? ((int)ch[k] - 32)
                             : (int)ch[k]);
          ch[i - 1] = (char)(ch[i - 1] >= 'a' && ch[i - 1] <= 'z'
                                 ? ((int)ch[i - 1] - 32)
                                 : (int)ch[i - 1]);
      }

      String str = String.valueOf(ch);  
      System.out.println(str);
	 }
	 
}