package Pattern;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		
		for(int i=1;i<=n;i++) {
			if(i==1 || i==n) {
				for(int j=1;j<=n;j++) {
				System.out.print("1 ");
				}
			}
			else {
				System.out.print(i +" ");
				for(int j=1;j<=n-2;j++) {
					System.out.print("  ");
				}
				System.out.print("5");
			}
			System.out.println();
		}

	}
}
