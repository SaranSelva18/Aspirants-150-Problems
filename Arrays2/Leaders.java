package Arrays2;

import java.util.*;

public class Leaders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {16, 17, 4, 3, 5, 2};
		
		List<Integer> list=new ArrayList<>();
		int maxright=arr[arr.length-1];
		list.add(maxright);
		
		for(int i=arr.length-1;i>0;i--) {
			if(arr[i]>maxright) {
				maxright=arr[i];
				list.add(maxright);
			}
			
		}
		for(int i=list.size()-1;i>=0;i--) {
			System.out.print(list.get(i)+" ");
		}
	}

}
