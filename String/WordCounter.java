package String;

public class WordCounter {
    public static int countWords(String s) {
        if (s == null || s.trim().isEmpty()) {
            return 0;
        }

        String[] words = s.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        System.out.println(countWords("Hello world"));                  
        System.out.println(countWords("   Welcome to  Java   "));      
        System.out.println(countWords(""));                            
        System.out.println(countWords("   "));                         
        System.out.println(countWords("OneWord"));                    
    }
}
