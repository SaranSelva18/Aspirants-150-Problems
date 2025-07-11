package Arrays2;

import java.util.*;

public class insert_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 0, 2, 3, 0, 4, 5, 0};
		int K = 0;
        
		List<Integer> list=new ArrayList<>();
		for(int num:arr) {
			list.add(num);
		}
		for(int i=0;i<arr.length;i++) {
			if(list.get(i)==0) {
				list.add(i+1,K);
				i++;
			}
		}
		while(list.size()>arr.length) {
			list.remove(list.size()-1);
		}
		System.out.print(list);
	}

}
