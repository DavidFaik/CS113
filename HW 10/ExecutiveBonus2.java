import java.util.Scanner;

public class ExecutiveBonus2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of executives: ");
        int numExecutives = scanner.nextInt();
        scanner.nextLine(); 

        Executive[] executives = new Executive[numExecutives];

        int validBonuses = 0;
        double totalPay = 0;

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

                executives[i] = new Executive(); 
                executives[i].setName(name);
                executives[i].setAddress(address);
                executives[i].setPhone(phone);
                executives[i].setSocialSecurityNumber(socSecNumber);
                executives[i].setPayRate(payRate);
                executives[i].awardBonus(bonus);

                if (bonus > 0 && bonus <= 10000) {
                    validBonuses++;
                }
                totalPay += executives[i].pay(); 
            } catch (BonusTooHighException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Bonus set to $0.");
                executives[i] = new Executive();
                executives[i].setBonus(0); 
            }
        }

        System.out.println("Total number of executives with valid bonuses: " + validBonuses);
        if (validBonuses > 0)
            System.out.println("Average pay: " + (totalPay / numExecutives)); 
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
    private String name;
    private String address;
    private String phone;
    private String socialSecurityNumber;
    private double payRate;
    private double bonus;

    public Executive() {
    
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void awardBonus(double execBonus) throws BonusTooHighException {
        if (execBonus > 10000) {
            throw new BonusTooHighException("Bonus amount exceeds $10000.");
        }
        bonus = execBonus;
    }

    public double pay() {
        double payment = payRate + bonus;
        bonus = 0;
        return payment;
    }
}

