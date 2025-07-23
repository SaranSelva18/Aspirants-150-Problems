package String;

import java.util.*;
public class AnagramChecker {
	public static boolean areAnagrams(String str1, String str2) {
		
		str1=str1.replaceAll("\\s+", "").toLowerCase();
		str2=str2.replaceAll("\\s+", "").toLowerCase();
		
		if(str1.length()!=str2.length())
			return false;
		
		char[] c1=str1.toCharArray();
		char[] c2=str2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		return Arrays.equals(c1, c2);
		
	
	}
	public static void main(String[] args) {
		  String s1 = "dogo";
	      String s2 = "godo";

	        boolean result = areAnagrams(s1, s2);
	        System.out.println("Are \"" + s1 + "\" and \"" + s2 + "\" anagrams? " + result);

	}

}
