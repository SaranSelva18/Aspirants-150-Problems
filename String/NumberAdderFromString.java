package String;

public class NumberAdderFromString {
	public static int sumNumbersInString(String s) {
		int sum=0;
		String st="";
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isDigit(c)) {
				st+=c;
			}
			else {
				if(!st.isEmpty()) {
					sum+=Integer.parseInt(st);
					st="";
				}
			}
		}
		if (!st.isEmpty()) {
            sum += Integer.parseInt(st);
        }
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(sumNumbersInString("5ingt44t3"));      
        System.out.println(sumNumbersInString("abc123def456"));   
        System.out.println(sumNumbersInString("99bottles"));     
        System.out.println(sumNumbersInString("a1b2c3"));         
        System.out.println(sumNumbersInString("noDigits"));      
		

	}

}
