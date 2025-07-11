package Arrays;

import java.util.*;

public class MinMaxRearrange {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 8, 7, 4};
        int[] result = rearrangeMinMax(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] rearrangeMinMax(int[] arr) {
        Arrays.sort(arr);
        int[] result = new int[arr.length];
        int left = 0, right = arr.length - 1;
        int index = 0;

        while (left <= right) {
            if (index % 2 == 0) {
                result[index++] = arr[left++];
            } else {
                result[index++] = arr[right--];
            }
        }

        return result;
    }
}
