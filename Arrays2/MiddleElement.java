package Arrays2;

public class MiddleElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {1, 2, 3, 4, 5};
		int[] arr = {7, 8, 9, 10, 11, 12};
		
		if(arr.length%2==0)
		System.out.print(arr[(arr.length/2)-1]+" "+arr[arr.length/2]  );
	}

}
