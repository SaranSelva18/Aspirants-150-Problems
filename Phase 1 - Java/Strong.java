public class Strong {
    static int fact(int x)
    {
        if(x==0||x==1)
            return 1;
        return x*fact(x-1);

    }
    public static void main(String[] args){
        int n=145,temp =n,sum=0,digit=0;
        while(n>0)
        {
            digit=n%10;5
            sum=sum+fact(digit);
            n=n/10;
        }
        if(temp==sum){
        System.out.println("Strong");
        }
        else{
        System.out.println("Not Strong");
        }
    } 
}
