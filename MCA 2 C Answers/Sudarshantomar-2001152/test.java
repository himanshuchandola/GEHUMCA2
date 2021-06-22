class test{
	public static void main(String[] argss){

		String input = "sudarshan";
		String output = "";
		char c1 = input.charAt(0);
		char c2 = input.charAt(input.length()-1);
		output = "" + String.valueOf(c1).toUpperCase();
		int length = input.length()-2;
		while(length>0){
			output = output + String.valueOf(input.charAt(length));
			length--;
		}
		output = output + String.valueOf(c2).toUpperCase();
		System.out.println("Input: " + input);
		System.out.println("Output: " + output);
	}
}