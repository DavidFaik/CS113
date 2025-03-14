import java.util.Scanner;

public class TestBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instantiate two Book objects
        Book book1 = new Book();
        Book book2 = new Book();

 // Update titles and pages with user input
        System.out.println("Enter title for book 1:");
        String title1 = scanner.nextLine();
        System.out.println("Enter pages for book 1:");
        int pages1 = scanner.nextInt();
        scanner.nextLine(); // consume newline character
        book1.setTitle(title1);
        book1.setPages(pages1);

        System.out.println("Enter title for book 2:");
        String title2 = scanner.nextLine();
        System.out.println("Enter title for book 2:");
        int pages2 = scanner.nextInt();
        scanner.nextLine(); // consume newline character
        book2.setTitle(title2);
        book2.setPages(pages2);

        // Display information about each book
        System.out.println("Book 1: " + book1);
        System.out.println("Book 2: " + book2);

        // Calculate and display the average number of pages
        double averagePages = (book1.getPages() + book2.getPages()) / 2.0;
        System.out.println("Average number of pages: " + averagePages);

        scanner.close();
    }
}
