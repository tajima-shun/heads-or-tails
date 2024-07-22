import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Who are you?");
        System.out.print("> ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        Random random = new Random();
        String[] results = new String[3];
        int headsCount = 0, tailsCount = 0;

        System.out.println("Tossing a coin...");
        for (int i = 0; i < 3; i++) {
            if (random.nextBoolean()) {
                results[i] = "Heads";
                headsCount++;
            } else {
                results[i] = "Tails";
                tailsCount++;
            }
            System.out.println("Round " + (i + 1) + ": " + results[i]);
        }

        System.out.println("Heads: " + headsCount + ", Tails: " + tailsCount);

        if (headsCount > tailsCount) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost!");
        }
    }
}