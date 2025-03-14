public class MyMethods {
    // Method to find  volume of box
    public double volume(double width, double length, double height) {
        return width * length * height;
    }

    // Method to find  average face value of two Die objects
    public double avgFaceValues(Die die1, Die die2) {
        return (die1.getFaceValue() + die2.getFaceValue()) / 2.0;
    }
}