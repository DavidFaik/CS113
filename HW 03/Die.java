public class Die {
    // Attribute
    private int faceValue;

    // Default constructor
    public Die() {
        faceValue = 3;
    }

    // Method to roll the die
    public void roll() {
        faceValue = (int) (Math.random() * 6) + 1;
    }

    // Getter method
    public int getFaceValue() {
        return faceValue;
    }

    // Setter method
    public void setFaceValue(int newFace) {
        faceValue = newFace;
    }
}