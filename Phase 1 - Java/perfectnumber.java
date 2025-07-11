public class perfectnumber {
    public static void main(String[] args) {
        num=6,sum=0;
        for(int i=1;i<=(num/2);i++)
        {
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(sum==num){
        System.out.print("It isna perfect number")
        }
    }
    
}
