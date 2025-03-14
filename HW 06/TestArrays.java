import java.util.Random;

public class TestArrays {
    
    public static void main(String[] args) {
        TestArrays app = new TestArrays();
        
        // Test numberFreq()
        int[] freq = app.numberFreq();
        System.out.println("Frequency of numbers 0-5:");
        for (int i = 0; i < freq.length; i++) {
            System.out.println(i + ": " + freq[i]);
        }
        
        // Test fibo
        int totalFiboNumbers = 10; // first 10 num
        int[] fibonacciSequence = app.fibo(totalFiboNumbers);
        System.out.println("\nFirst " + totalFiboNumbers + " Fibonacci numbers:");
        for (int num : fibonacciSequence) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Test oddDice()
        Die[] dice = {new Die(6), new Die(6), new Die(6)}; 
        int oddCount = app.oddDice(dice);
        System.out.println("\nNumber of dice that landed on an odd number: " + oddCount);
    }
    
    public int[] numberFreq() {
        Random rand = new Random();
        int[] freq = new int[6];
        
        for (int i = 0; i < 100; i++) {
            int number = rand.nextInt(6);
            freq[number]++;
        }
        
        return freq;
    }
    
    public int[] fibo(int total) {
        if (total <= 0) return new int[0];
        
        int[] fibonacci = new int[total];
        
        if (total >= 1) fibonacci[0] = 1;
        if (total >= 2) fibonacci[1] = 1;
        
        for (int i = 2; i < total; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        
        return fibonacci;
    }
    
    public int oddDice(Die[] dice) {
        int oddCount = 0;
        
        for (Die die : dice) {
            if (die.roll() % 2 != 0) oddCount++;
        }
        
        return oddCount;
    }

    static class Die {
        private int sides;
        private Random rand = new Random();
    
        public Die(int sides) {
            this.sides = sides;
        }
    
        public int roll() {
            return rand.nextInt(sides) + 1;
        }
    }
}
