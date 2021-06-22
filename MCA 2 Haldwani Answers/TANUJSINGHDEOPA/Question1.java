class Main{
    public static void main(String[] args) {
        String sample="tanuj singh deopa";
        
        char c1=sample.charAt(0);
        char c2=sample.charAt(sample.length()-1);
         System.out.print(Character.toUpperCase(c1)); 
         for(int i=sample.length()-1;i>1;--i) 
        {  
            System.out.print(sample.charAt(i-1));        
        }
        System.out.print(Character.toUpperCase(c2));
    }
}