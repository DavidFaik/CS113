public class oddDie {
    
    public int oddDice(Die[] dice) {
        int oddCount = 0;
        
        for (Die die : dice) {
            if (die.roll() % 2 != 0) oddCount++; // Check if the die roll is odd
        }
        
        return oddCount; // Return the count of dice with odd face values
    }
}
