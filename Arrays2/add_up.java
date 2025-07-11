package Arrays2;

public class add_up {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0, -1, 2, -3, 1}; 
		int target = -2;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int ans =arr[i]+arr[j];
				if(ans==target) {
					System.out.print(i +" " +j);
				}
			}
		}
	}

}
