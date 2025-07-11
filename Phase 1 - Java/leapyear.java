public class leapyear {
    public static void main(String[] args) {
        int year=2000;
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.print("Leap year");
                }
                else
                    System.out.print("Not a leap year");
            }
            else
                System.out.print("Not a leap year");  
            }
            else
                System.out.print("Not a leap year");
        }
    }
