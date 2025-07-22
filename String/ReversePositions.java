package String;

public class ReversePositions {

    public static String reverseByPosition(String inp1, String inp2) {
        char[] chars = inp1.toCharArray();
        int len = chars.length;

        
        java.util.List<Integer> indices = new java.util.ArrayList<>();

        for (int i = 0; i < len; i++) {
            
            if (inp2.equalsIgnoreCase("odd") && (i ) % 2 != 0) {
                indices.add(i);
            } else if (inp2.equalsIgnoreCase("even") && (i ) % 2 == 0) {
                indices.add(i);
            }
        }

        
        int left = 0;
        int right = indices.size() - 1;
        while (left < right) {
            int i = indices.get(left);
            int j = indices.get(right);

            
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String inp1 = "chennaicity";
        String inp2 = "odd";

        String result = reverseByPosition(inp1, inp2);
        System.out.println(result);  
    }
}

