package Arrays;
import java.util.*;
public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {10, 20, 30, 40};
		
		List<Integer> list=new ArrayList<>();
		
		for(int num:arr) {
			list.add(num);
			
		}
		list.add(3, 50);
		System.out.println(list);
		

	}

}
