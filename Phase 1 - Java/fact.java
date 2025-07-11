public class fact{
    static int fact1(int n)
    {
        if(n==0||n==1)
            return 1;
        return n*fact1(n-1);

    }
    public static void main(String[] args){
        int x=5;
        int res=fact1(x);
        System.out.println(res);
    } 
}