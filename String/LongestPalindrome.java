package String;

public class LongestPalindrome {
	public static void main(String[] args) {
		String input="babad";
		
		for(int i=0;i<input.length();i++) {
			for(int j=i+1;j<input.length();j++) {
				String part = input.substring(i,j);
				if(part.length()>2) {
				if(ispalindrome(part)) {
					System.out.println(part);
				}
				}
			}
		}
	}
	public static boolean ispalindrome(String part) {
		for(int i=0;i<part.length()/2;i++) {
			if(part.charAt(i)!=part.charAt(part.length()-i-1)) {
				return false;
			}
		}
		return true;
	}

}
