class GFG {
    static String FirstAndLast(String str)
    {
 
        // Create an equivalent char array
        // of given string
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
 
            // k stores index of first character
            // and i is going to store index of last
            // character.
            int k = i;
            while (i < ch.length && ch[i] != ' ')
                i++;
 
            // Check if the character is a small letter
            // If yes, then Capitalise
            ch[k] = (char)(ch[k] >= 'a' && ch[k] <= 'z'
                               ? ((int)ch[k] - 32)
                               : (int)ch[k]);
            ch[i - 1] = (char)(ch[i - 1] >= 'a' && ch[i - 1] <= 'z'
                                   ? ((int)ch[i - 1] - 32)
                                   : (int)ch[i - 1]);
        }
	
      int n=ch.length;
     System.out.println("Reversed string is");
     for(int i=n-1;i>=0;i--)
     {
       System.out.print(ch[i]);
	}
 
        return new String(ch);
    }
 
    // Driver code
    public static void main(String args[])
    {
        String str = "university";
        
        FirstAndLast(str);
        
    }
}