package String;

public class Reverse_String {

	public static void main(String[] args) {
		String word = "Programming is fun";
		
		String[] split=word.split("\\s+");
		
		for(int i=split.length-1;i>=0;i--) {
			System.out.print(split[i]+" ");
			
		}



	}

}
