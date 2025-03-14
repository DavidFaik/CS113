import java.util.Random;

public class RandomPlate {
    public static void main(String[] args) {
        
        // Define number of letters and digits
        final int NUM_LETTERS = 5;
        final int NUM_DIGITS = 2;

        // Generate random letters
        StringBuilder plateNumber = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < NUM_LETTERS; i++) {
            char letter = (char) ('A' + random.nextInt(26));
            plateNumber.append(letter);
        }

        // Generate random digits for the plate number
        for (int i = 0; i < NUM_DIGITS; i++) {
            int digit = random.nextInt(10);
            plateNumber.append(digit);
        }

        // Print the generated plate number
        System.out.println("Plate number: " + plateNumber.toString());
    }
}
