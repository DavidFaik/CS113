import java.util.Random;

public class numberFreq {
    
    public int[] numberFreq() {
        Random rand = new Random();
        int[] freq = new int[6]; // Array to store frequencies of numbers 0-5
        
        for (int i = 0; i < 100; i++) {
            int number = rand.nextInt(6); // Generate a random number between 0 and 5
            freq[number]++; // Increment the frequency of the generated number
        }
        
        return freq; // Return the array with frequencies
    }
}