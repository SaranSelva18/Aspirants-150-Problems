	import java.util.*;
	
	public class Magic {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int sum, d;
	
	        while (a >= 10) {
	            sum = 0;
	            while (a > 0) {
	                d = a % 10;
	                sum += d;
	                a = a / 10;
	            }
	            a = sum;
	        }
	
	        if (a == 1)
	            System.out.println("Magic Number");
	        else
	            System.out.println("Not a Magic Number");
	    }
	}
