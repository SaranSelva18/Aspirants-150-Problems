package String;

public class RemoveLeadingZeros {

	public static void main(String[] args) {
		 String input = "000012356090";
	     int i = 0;
	     
	     while(input.charAt(i)=='0') {
	    	 i++;
	     }
	     String result = input.substring(i);
	     System.out.println(result);

	}

}
