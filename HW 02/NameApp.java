import java.util.Scanner;

public class NameApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get first name
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        // Get last name
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        // Get initials
        char firstInitial = firstName.charAt(0);
        char lastInitial = lastName.charAt(0);
        String initials = "" + firstInitial + lastInitial;

        // Find total length of the name
        int totalLength = firstName.length() + lastName.length();

        // Print results
        System.out.println("Initials: " + initials);
        System.out.println("Total length: " + totalLength);

        scanner.close();
    }
}
