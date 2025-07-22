package String;

public class LowerFollowedByUpper {

    public static void main(String[] args) {
        String input = "accept Van";
        int count = countLowerFollowedByUpper(input);
        System.out.println(count);  
    }

    public static int countLowerFollowedByUpper(String input) {
        int count = 0;
        input = input.replaceAll("\\s+", "");
        for (int i = 0; i < input.length() - 1; i++) {
            char current = input.charAt(i);
            char next = input.charAt(i + 1);

            if (Character.isLowerCase(current) && Character.isUpperCase(next)) {
                count=count+2;
            }
        }

        return count;
    }
}
