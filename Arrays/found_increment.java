package Arrays;

import java.util.*;

public class found_increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={10,20,10,30,14,40,60,10};
		int Search=10;
		int counter =1;
		
		List<Integer> result=new ArrayList<>();
		
		for(int value:arr) {
			result.add(value);
			if(value==Search) {
				result.add(counter++);
			}
		}
		
		System.out.print(result);
				

		}
}
