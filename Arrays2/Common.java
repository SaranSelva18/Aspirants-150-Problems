package Arrays2;

import java.util.*;

public class Common {

    public static List<Integer> getCommonElementsWithDuplicates(int[] a, int[] b) {
        boolean[] visited = new boolean[b.length];
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j] && !visited[j]) {
                    result.add(a[i]);
                    visited[j] = true; 
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 1, 3, 1};
        int[] b = {3, 1, 3, 4, 1};

        List<Integer> common = getCommonElementsWithDuplicates(a, b);
        System.out.println("Common elements: " + common);
    }
}
