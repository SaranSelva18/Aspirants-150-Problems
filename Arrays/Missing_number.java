package Arrays;

import java.util.*;

public class Missing_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        int[] arr = {3, 7, 1, 2, 8, 4, 5};
		        int n = arr.length + 1; // Because one number is missing

		        int expectedSum = n * (n + 1) / 2;
		        int actualSum = 0;

		        for (int num : arr) {
		            actualSum += num;
		        }

		        int missingNumber = expectedSum - actualSum;
		        System.out.println("Missing number is: " + missingNumber);
		    }

		}



