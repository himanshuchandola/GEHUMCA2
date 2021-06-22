import java.util.*;
class Main
{
  public static void main(String args[])
  {
    String original, reverse = "";
    Scanner in = new Scanner(System.in);

    System.out.println("Enter a string to reverse");
    original = in.nextLine();

    int length = original.length();
    
    for (int i = length - 2 ; i >= 1 ; i--)
      reverse = reverse + original.charAt(i);
    
    String rev=original.substring(0, 1).toUpperCase() + reverse +original.substring(length-1, length).toUpperCase();
    System.out.println("Reverse of the string: " + rev  );
  }
}