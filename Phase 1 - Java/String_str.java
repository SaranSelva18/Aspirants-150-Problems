import java.util.Scanner;

public class String_str{
    public static void main(String[] args) {
        String name = "Hello";
        System.out.println(name);
        name = "World";
        System.out.println(name);
        change_name(name);
        System.out.println(name);
    }
    static void change_name(String name ){
        name = "Ruban";
        System.out.println(name);
    }
}