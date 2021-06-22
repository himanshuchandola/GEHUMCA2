/* Nikhil Joshi 
  id-20711105
  Course-Mca 2
  Campus-Haldwani
*/

import java.util.*;
class PrintElement
{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the String: ");
  String s = sc.nextLine();
  int len = s.length();
  len = len-1;
  
   System.out.println(len);
  char[] c= s.toCharArray();
  c[0] = Character.toUpperCase(c[0]); 
  c[len] = Character.toUpperCase(c[len]);   
   for(int i=len-1,j=1;i>j;i--,j++){
    char temp = c[j];
    c[j] = c[i];
    c[i] = temp;
   }
    for(int i=0;i<=len;i++){
    System.out.print(c[i]);
   }
}
}