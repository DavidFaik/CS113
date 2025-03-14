import java.util.Arrays;

class Die {
    public int roll() {
        return (int) (Math.random() * 6) + 1;
    }
}

public class TestArrays {

    // Problem 1
    
    public static int[] salesRange(int[][] sales) {
        int lowest = Integer.MAX_VALUE;
        int highest = Integer.MIN_VALUE;
        for (int[] week : sales) {
            for (int amount : week) {
                if (amount < lowest) {
                    lowest = amount;
                }
                if (amount > highest) {
                    highest = amount;
                }
            }
        }
        int range = highest - lowest;
        return new int[]{lowest, highest, range};
    }

    // Problem 2    
    public static int[] dieStats(Die[][] dice) {
        int[] result = new int[dice.length];
        for (int i = 0; i < dice.length; i++) {
            int count = 0;
            for (Die die : dice[i]) {
                if (die.roll() % 2 != 0) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }

    public static void main(String[] args) {
        // Test Problem 1
        int[][] sales = {
                {200, 350, 400},
                {150, 375, 225}
        };
        int[] salesRangeResult = salesRange(sales);
        System.out.println("Problem 1: " + Arrays.toString(salesRangeResult));

        // Test Problem 2
        Die[][] dice = {
                {new Die(), new Die(), new Die()},
                {new Die(), new Die(), new Die()}
        };
        int[] dieStatsResult = dieStats(dice);
        System.out.println("Problem 2: " + Arrays.toString(dieStatsResult));
    }
}
