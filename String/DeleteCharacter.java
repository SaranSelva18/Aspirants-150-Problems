package String;

public class DeleteCharacter {

    public static void main(String[] args) {
        String a = "aaaa";
        String b = "aabbbb";

        StringBuilder result = new StringBuilder(b);

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            int index = result.indexOf(String.valueOf(ch));
            if (index != -1) {
                result.deleteCharAt(index);
            }
        }

        System.out.println("Output: " + result.toString());
    }
}
