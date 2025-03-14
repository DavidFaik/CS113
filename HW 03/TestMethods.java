public class TestMethods {
    public static void main(String[] args) {
        // Creating an instance of the MyMethods class
        MyMethods myMethods = new MyMethods();

        // Test the volume method
        double volume = myMethods.volume(2, 3, 4);
        System.out.println("Volume of Box: " + volume);

        // Test the avgFaceValues method
        Die die1 = new Die();
        Die die2 = new Die();
        double avgFaceValue = myMethods.avgFaceValues(die1, die2);
        System.out.println("Average face value of die: " + avgFaceValue);
    }
}