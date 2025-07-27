package String;

public class CountWords {

	public static void main(String[] args) {
		String word = "The quick brown fox jumps over the lazy dog";
		
		String[] ans=word.split("\\s+");
		
		int count=0;
		for(int i=0;i<ans.length;i++) {
			count++;
		}
		System.out.println(count);
	}

}
