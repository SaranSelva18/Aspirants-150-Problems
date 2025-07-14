package Arrays2;

import java.util.*;

public class SlidingWindowMax {

	public static void main(String[] args) {
		int[] arr = {10, 5, 2, 7, 8, 7};
        int k = 3;
        
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<arr.length-k;i++) {
        	int max = arr[i];
        	
        	for(int j=1;j<k;j++) {
        		if(arr[i+j]>max) {
        			max=arr[i+j];
        		}
        	}
        	result.add(max);
        }
       System.out.println(result);
	}

}
