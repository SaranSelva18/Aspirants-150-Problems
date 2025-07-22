package String;

public class PatternMatcher {

    public static void main(String[] args) {
        String pattern = "fi_er";
        String data = "Fever:Filer:Filter:FIxer:Fiber:Fibre:Tailor:Offer";

        findAndPrintMatches(pattern, data);
    }

    public static void findAndPrintMatches(String pattern, String data) {
       
        String regex = pattern.replace("_", ".").toLowerCase();

        String[] words = data.split(":");

        for (String word : words) {
            if (word.length() == pattern.length()) {
                if (word.toLowerCase().matches(regex)) {
                    // Convert to Capital Case
                    String capital = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                    System.out.println(capital);
                }
            }
        }
    }
}
