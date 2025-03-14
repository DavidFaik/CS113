import java.util.Scanner;

public class timeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of seconds: ");
        int totalSeconds = scanner.nextInt();

        scanner.close();

        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        System.out.println("The equivalent time is: " + hours + " hour(s), " + minutes + " minute(s), " + seconds + " second(s)");
    }
}
