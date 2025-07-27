package String;

public class Capitalized_words {

	public static void main(String[] args) {
		String word="Emma-is-a-data-scientist";
		
		String[] ans=word.split("-");
		
		for(String w :ans) {
			String result =w.substring(0,1).toUpperCase() + w.substring(1).toLowerCase();
			System.out.println(result);
		}

	}

}
