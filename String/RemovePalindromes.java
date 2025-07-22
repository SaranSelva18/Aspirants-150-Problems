package String;

import java.util.*;
public class RemovePalindromes {

	public static void main(String[] args) {
		String input = "In India Malayalam is best with dad and mom";
        String result = removePalindromicWords(input);
        System.out.println(result);
	}
	
	public static boolean isPalindrome(String w) {
		String lower = w.toLowerCase();
		int left =0;
		int right=lower.length()-1;
		
		while(left<right) {
			if(lower.charAt(left)!=lower.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	public static  String removePalindromicWords(String input) {
		String[] words=input.split("\\s+");
		StringBuilder result =new StringBuilder();
		
		for(String w:words) {
			if(!isPalindrome(w)) {
				result.append(w).append(" ");
			}
		}
		return result.toString().trim();
	}

}
