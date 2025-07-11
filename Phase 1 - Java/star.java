public class star {
    public static void main(String[] args) {
        plus(args);
    
}
public static void square(String[] args){
for(int i=1;i<=5;i++){
    for(int j=1;j<=5;j++){
        System.out.print("* ");
    }
    System.out.println();
}
}

public static void triangle(String[] args){
    for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    }


    public static void triangleupside(String[] args){
        int n=5;
        for(int i=0;i<5;i++){
            for(int j=n;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        }
    


        public static void space(String[] args){
            int n=5;
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    if(j==0 || j==n-1){
                    System.out.print("* ");
                    }
                    else{
                    System.out.print("  ");
                    }
                }
                System.out.println();
            }
            }


            public static void plus(String[] args){
                int n=5;
                for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++){
                        if(j==n%2+1 || i==n%2+1){
                        System.out.print("* ");
                        }
                        else{
                        System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
                }
            }