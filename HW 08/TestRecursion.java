public class TestRecursion {
    public static void main(String[] args) {
        // Test 1
        printDigits(123147);

        // Test 2
        int[] a = {1, 3, 2, 5};
        System.out.println("sumArray(a, 3): " + sumArray(a, 3));
        System.out.println("sumArray(a, 4): " + sumArray(a, 4));
    }

    // Problem 1
    public static void printDigits(int num) {
        if (num / 10 == 0) {
            System.out.println(num);
            return;
        }
        printDigits(num / 10);
        System.out.println(num % 10);
    }

    // Problem 2
    public static int sumArray(int[] numArray, int count) {
        if (count == 1)
            return numArray[0];
        return numArray[count - 1] + sumArray(numArray, count - 1);
    }
}
