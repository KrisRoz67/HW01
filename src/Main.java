import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name ?");
        String username = scanner.nextLine();
        System.out.println("Welcome," + username + "!");
    }

}