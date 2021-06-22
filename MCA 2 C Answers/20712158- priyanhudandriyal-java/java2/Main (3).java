/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


class Main
{
     
// Function to reverse the given word except
// the first and the last character
static String reverseWord(String str)
{
    int len = str.length();
     
    // Pointer to the second character
    // of the string
    int i = 1;
 
    // Pointer to the second last
    // character of the string
    int j = str.length() - 2;
     
    char[] strchar = str.toCharArray();
 
    while (i < j)
    {
 
        // Swap str[i] and str[j]
        char temp = strchar[i];
        strchar[i] = strchar[j];
        strchar[j] = temp;
        i++;
        j--;
    }
     
    str = new String(strchar);
    return str;
}
 
// Function to reverse every word of the
// sentence except the first and the
// last character of the words
static void reverseWords(String str)
{
    String[] tok = str.split("\\s");
 
    // While there are words left
    for(String w:tok)
    {
 
        // Print the reversed word
        System.out.print(reverseWord(w) + " ");
    }
}
 
// Driver code
public static void main (String[] args)
{
    
   // String newstr="";
    String str = "geeks for geeks";
    
    int stringLength = str.length();
  
  
  
  String letter1 = str.substring (0,1);
String lastletter = str.substring ((stringLength-1),(stringLength));
String newWord =letter1.toUpperCase() + str.substring(1, stringLength-1) + lastletter.toUpperCase();
   
    reverseWords(newWord);
}
}
