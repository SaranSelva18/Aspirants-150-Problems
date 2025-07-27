package String;

public class Mixcase {

	public static void main(String[] args) {
		String word ="helloworld";
		
		String ans=word.substring(0,word.length()/2).toLowerCase() + word.substring(word.length()/2,word.length()).toUpperCase();
		System.out.println(ans);

	}

}
