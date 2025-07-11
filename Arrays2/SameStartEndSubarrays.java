package Arrays2;

public class SameStartEndSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = {1, 2, 1, 5, 2};
		
		int count=0;
		for(int i=0;i<A.length;i++) {
			for(int j=i;j<A.length;j++) {
				if(A[i]==A[j])
					count++;
			}
			
		}
		System.out.print(count);
	}

}
