import java.util.Scanner;

public class TestDog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of dogs in the kennel: ");
        int numDogs = scanner.nextInt();
        System.out.println("");
        scanner.nextLine(); 

        double totalAge = 0;
        Dog oldestDog = null;

        for (int i = 0; i < numDogs; i++) {
            System.out.print("Enter Dog breed: ");
            String breed = scanner.nextLine();
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            System.out.println("");
            scanner.nextLine(); 
            
            Dog dog = new Dog(age, breed);
            totalAge += age;

            if (oldestDog == null || dog.compareTo(oldestDog) > 0) {
                oldestDog = dog;
            }
        }

        if (numDogs > 0) {
            double averageAge = totalAge / numDogs;
            System.out.println("Average age: " + averageAge);
            System.out.println("Oldest Dog -> " + oldestDog.toString());
        } else {
            System.out.println("No dogs in the kennel.");
        }

        scanner.close();
    }
}
