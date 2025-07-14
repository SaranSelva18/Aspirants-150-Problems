package Arrays2;

public class decreasingSeq {

	public static void main(String[] args) {
		int[] input1 = {11, 3, 1, 4, 7, 8, 12, 2, 3, 7};
		int input2 = 10;


		    int count = 0;        // number of decreasing sequences
		    int maxLength = 0;    // length of longest decreasing sequence
		    int currentLength = 1;

		    for (int i = 1; i < input2; i++) {
		        if (input1[i] < input1[i - 1]) {
		            currentLength++;
		        } else {
		            if (currentLength > 1) {
		                count++;
		                if (currentLength > maxLength) {
		                    maxLength = currentLength;
		                }
		            }
		            currentLength = 1;
		        }
		    }

		    // Handle the last sequence if it ended at the last element
		    /*if (currentLength > 1) {
		        count++;
		        if (currentLength > maxLength) {
		            maxLength = currentLength;
		        }
		    }*/

		    System.out.println(count);
		    System.out.println(maxLength);
		}

	}

