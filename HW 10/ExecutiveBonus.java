import java.util.Scanner;

public class ExecutiveBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of executives: ");
        int numExecutives = scanner.nextInt();
        scanner.nextLine();

        Executive[] executives = new Executive[numExecutives];

        for (int i = 0; i < numExecutives; i++) {
            try {
                System.out.println("Enter details for Executive " + (i + 1) + ":");
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Address: ");
                String address = scanner.nextLine();
                System.out.print("Phone: ");
                String phone = scanner.nextLine();
                System.out.print("Social Security Number: ");
                String socSecNumber = scanner.nextLine();
                System.out.print("Pay Rate: ");
                double payRate = scanner.nextDouble();
                System.out.print("Bonus: ");
                double bonus = scanner.nextDouble();
                scanner.nextLine();

                executives[i] = new Executive(name, address, phone, socSecNumber, payRate);
                executives[i].awardBonus(bonus);

            } catch (BonusTooHighException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Program terminated.");
                System.exit(1);
            }
        }

        int validBonuses = 0;
        double totalPay = 0;

        for (Executive executive : executives) {
            if (executive.getBonus() > 0 && executive.getBonus() <= 10000) {
                validBonuses++;
                totalPay += executive.pay();
            }
        }

        System.out.println("Total number of executives with valid bonuses: " + validBonuses);
        if (validBonuses > 0)
            System.out.println("Average pay: " + (totalPay / validBonuses));
        else
            System.out.println("No valid bonuses entered.");
    }
}

class BonusTooHighException extends Exception {
    public BonusTooHighException(String message) {
        super(message);
    }
}

class Executive {
    private double bonus;

    private String name;
    private String address;
    private String phone;
    private String socialSecurityNumber;
    private double payRate;

    public Executive(String name, String address, String phone, String socialSecurityNumber, double payRate) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.socialSecurityNumber = socialSecurityNumber;
        this.payRate = payRate;
    }

    public void awardBonus(double execBonus) throws BonusTooHighException {
        if (execBonus > 10000) {
            throw new BonusTooHighException("Bonus amount exceeds $10000.");
        }
        bonus = execBonus;
    }

    public double getBonus() {
        return bonus;
    }

    public double pay() {
        double baseSalary = 0.00;
        double payment = payRate + bonus;
        bonus = 0; 
        return payment;
    }
}
