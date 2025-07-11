package Pattern;

public class Pattern7 {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (char j = (char) ('E' - i); j >= 'A'; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

