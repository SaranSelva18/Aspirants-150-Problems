package Arrays;

public class Duplicate_Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int n = arr.length;
        boolean[] visited = new boolean[n];  // To avoid counting the same element again

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;

            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            
            if (count >  1) {
                System.out.println(arr[i] + " " + count);
            }
        }
 

	}

}
