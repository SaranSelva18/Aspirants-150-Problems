package Arrays2;

public class MostFrequentlyOccurringDigit {

	public static void main(String[] args) {
		int[] input1 = {1237, 202, 666, 140};
		
		int[] freq=new int[10];
		for(int i=0;i<input1.length;i++) {
         int num=input1[i];
         
         while(num>0) {
        	 int digit=num%10;
        	 freq[digit]++;
        	 num/=10;
         }
		}
         int max=0;
         int ans=0;
         for(int i=0;i<=9;i++) {
        	 if(freq[i]>=max) {
            	 max=freq[i];
            	 ans=i;
         }
         
         }
         
         
         System.out.print(ans);

	}
}