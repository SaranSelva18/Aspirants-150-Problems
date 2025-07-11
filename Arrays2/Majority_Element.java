package Arrays2;

public class Majority_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 1, 2, 1, 3, 5, 1};
		int l=arr.length/2;
		
		for(int i=0;i<arr.length;i++) {
			int count =0;
			for(int j=i;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>l)
				System.out.print(arr[i]);
		}
	}

}
