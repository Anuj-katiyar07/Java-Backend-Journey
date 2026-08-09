import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 10000;

        System.out.println("===== ATM SYSTEM =====");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {

            System.out.println("Balance = " + balance);

        } else if (choice == 2) {

            System.out.print("Enter deposit amount: ");
            double deposit = sc.nextDouble();

            balance = balance + deposit;

            System.out.println("New Balance = " + balance);

        } else if (choice == 3) {

            System.out.print("Enter withdraw amount: ");
            double withdraw = sc.nextDouble();

            if (withdraw <= balance) {

                balance = balance - withdraw;

                System.out.println("New Balance = " + balance);

            } else {

                System.out.println("Insufficient Balance");
            }

        } else {

            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}