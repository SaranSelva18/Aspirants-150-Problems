package Pattern;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		
		for(int i=0;i<n;i++) {
			for(int k=0;k<i;k++) {
				System.out.print(" ");
			}
			for(int j=1+i;j<=n;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}
}
