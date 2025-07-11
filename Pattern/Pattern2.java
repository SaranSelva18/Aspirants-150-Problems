package Pattern;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0;i<=n;i++) {
			if(i%2==0) {
				for(int j=0;j<i;j++) {
				System.out.print(0+" ");
			}}
		    else {
		    	for(int j=0;j<i;j++) {
		    	System.out.print(1+" ");
			}}
			System.out.println();
		}

	}
}
