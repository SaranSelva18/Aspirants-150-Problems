package Arrays2;
import java.util.*;
public class CheckArraysEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int[] a = {1, 2, 5, 4, 0};
	       int[] b = {2, 4, 5, 0, 1};
	       
	       if(areArraysEqual(a,b)) {
	    	   System.out.println("True");
	       }
	       else {
	    	   System.out.println("False");
	       }
	}
	       public static boolean areArraysEqual(int[] a,int[] b) {
	    	   if(a.length!=b.length) {
	    		   return false;
	    	   }
	    	   Arrays.sort(a);
	    	   Arrays.sort(b);
	    	   for(int i=0;i<a.length-1;i++) {
	    		   if(a[i]!=b[i]) {
	    			   return false;
	    		   }
	    	   }
	    	   return true;
	       }

	}


