package Arrays2;

import java.util.*;

public class EqualSubarraySplit {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5};

        int total = 0;
        for (int num : arr) total += num;

        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            leftSum += arr[i];
            int rightSum = total - leftSum;

            if (leftSum == rightSum) {
                System.out.print("{");
                for (int j = 0; j <= i; j++) {
                    System.out.print(arr[j]);
                    if (j < i) System.out.print(", ");
                }
                System.out.println("}");

                System.out.print("{");
                for (int j = i + 1; j < arr.length; j++) {
                    System.out.print(arr[j]);
                    if (j < arr.length - 1) System.out.print(", ");
                }
                System.out.println("}");
                return;
            }
        }

        System.out.println("Not possible to split into equal sum subarrays.");
    }
}
