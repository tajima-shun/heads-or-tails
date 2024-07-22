import java.util.Random;

public class HeadsOrTails {
    public static void main(String[] args) {
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