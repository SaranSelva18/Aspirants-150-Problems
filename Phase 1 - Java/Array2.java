
import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int[] a ={1,2,3};
        int[] b =new int[a.length];

        for (int i =0;i<a.length;i++){
            b[i]=a[i]*2;
        }
        System.out.println(Arrays.toString(b));
    }
    
}
