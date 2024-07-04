import java.util.Random;

public class HeadsOrTails {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Tossing a coin...");
        String[] results = new String[3];
        for (int i = 0; i < 3; i++) {
            results[i] = random.nextBoolean() ? "Heads" : "Tails";
            System.out.println("Round " + (i + 1) + ": " + results[i]);
        }

        int heads = 0, tails = 0;
        for (String result : results) {
            if (result.equals("Heads")) {
                heads++;
            } else {
                tails++;
            }
        }
        System.out.println("Heads: " + heads + ", Tails: " + tails);
    }
}
