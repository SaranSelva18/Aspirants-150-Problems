package String;
import java.util.*;
public class Aptimind_str {

	public static void main(String[] args) {
		String mainStr = "Capdhdhjscap";
        String subStr = "cap";
        
        String lowermainStr=mainStr.toLowerCase();
        String lowersubStr=subStr.toLowerCase();
        
        for(int i=0;i<=mainStr.length()-subStr.length();i++) {
        	if(lowermainStr.substring(i,i+subStr.length()).equals(lowersubStr))	
        	System.out.println("Found at " + (i+1));
        }
		

	}

}
