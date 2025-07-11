public class minmax {
    public static void main(String[] args) {
        int marks[]={2,3,4};
        int min=marks[0];
        int max=marks[0];

        for(int i=1;i<marks.length;i++){
            if(marks[i]>min){
                max=marks[i];
            }
            if(marks[i]<max){
                min=marks[i];
            }  
        }
        System.out.println(min);  
        System.out.println(max);
    }
    
}
