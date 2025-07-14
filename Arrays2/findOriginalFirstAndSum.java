package Arrays2;
import java.util.*;

public class findOriginalFirstAndSum {

	public static void main(String[] args) {
		int[] input1 = {7, 6, 8, 16, 12, 3};
		int input2=6;
		
		 int[] original = new int[input2];
		    
		    original[input2 - 1] = input1[input2 - 1];

		    for (int i = input2 - 2; i >= 0; i--) {
		        original[i] = input1[i] - original[i + 1];
		    }

		    int sum = 0;
		    for (int i = 0; i < input2; i++) {
		        sum += original[i];
		    }

		    System.out.println("First original element: " + original[0]);
		    System.out.println("Sum of original elements: " + sum);
	}
	


}
