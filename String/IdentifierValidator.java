package String;

public class IdentifierValidator {
	public static boolean isValidIdentifier(String s) {
		if(s==null ||s.isEmpty()) {
			return false;
		}
		char firstchar=s.charAt(0);
		if(!Character.isLetter(firstchar) && firstchar!='_') {
			return false;
		}
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
            if (!Character.isLetterOrDigit(c) && c != '_') {
                return false;
		}
	}
		return true;
	}

	public static void main(String[] args) {
		    System.out.println(isValidIdentifier("abc123"));   
	        System.out.println(isValidIdentifier("_temp"));   
	        System.out.println(isValidIdentifier("123abc"));   
	        System.out.println(isValidIdentifier("a bc"));     
	        System.out.println(isValidIdentifier("a$bc"));     
	        System.out.println(isValidIdentifier(""));
		

	}

}
