import java.util.Arrays;

// Problem 1
class MonetaryCoin extends Coin {
    private int valueInCents;

    public MonetaryCoin(int valueInCents) {
        setValueInCents(valueInCents);
    }

    public int getValueInCents() {
        return valueInCents;
    }

    public void setValueInCents(int valueInCents) {
        if (valueInCents < 1 || valueInCents > 100) {
            System.out.println("Value must be between 1 and 100.");
        }
        this.valueInCents = valueInCents;
    }

    @Override
    public String toString() {
        return "(" + valueInCents + ", " + super.toString() + ")";
    }
}

// Problem 2
public class TestMCoins {
    public static void main(String[] args) {
        MonetaryCoin[][] coins = new MonetaryCoin[3][5];

        for (int i = 0; i < coins.length; i++) {
            for (int j = 0; j < coins[i].length; j++) {
                int randomValue = (int) (Math.random() * 100) + 1; 
                coins[i][j] = new MonetaryCoin(randomValue);
            }
        }

         for (int i = 0; i < coins.length; i++) {
            int totalValue = 0;
            for (int j = 0; j < coins[i].length; j++) {
                coins[i][j].flip(); 
                if (coins[i][j].isHeads()) { 
                    totalValue += coins[i][j].getValueInCents(); 
                }
            }
            System.out.println(totalValue);
        }
    }
}
