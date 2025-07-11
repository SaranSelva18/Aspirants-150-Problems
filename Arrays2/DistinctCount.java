package Arrays2;

import java.util.*;
public class DistinctCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Integer[] arr1 = {1, 2, 3, 4};
	     Integer[] arr2 = {3, 4, 5, 6};
	     Integer[] arr3 = {6, 7, 8};
	     
	     Set<Integer> A=new HashSet<>(Arrays.asList(arr1));
	     Set<Integer> B=new HashSet<>(Arrays.asList(arr2));
	     Set<Integer> C=new HashSet<>(Arrays.asList(arr3));
	     
	     int count1=0,count2=0,count3=0;
	     for(int num:A) {
	    	 if(!B.contains(num) && !C.contains(num)) {
	    		 count1++;
	    	 }
	     }
	     for(int num:B) {
	    	 if(!A.contains(num) && !C.contains(num)) {
	    		 count2++;
	    	 }
	     }
	     for(int num:C) {
	    	 if(!A.contains(num) && !B.contains(num)) {
	    		 count3++;
	    	 }
	     }
         
	     System.out.print(count1 + " "+count2 + " "+count3);

	}

}
