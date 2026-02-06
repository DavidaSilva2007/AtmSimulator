import java.util.ArrayList;
import java.util.Scanner;

public class AtmSimulator {

    // Scanner for pin input and menu.
    static Scanner scanner = new Scanner(System.in);
    // Runs the main menu of the program, when false, program finishes.
    static boolean running = true;

    // Stores the balance of the account.
    static int balance = 10000;
    // A list of all the transactions made, able to print it.
    static ArrayList<String> transactions = new ArrayList<>();
    // Stores the user's PIN
    static int basePin = 1234;

    public static void main(String[] args) {
        while (!logIn()) {
            System.out.println("Invalid PIN, please try again");
        }
        System.out.println("You are logged in!");

        changePin();
        System.out.println(basePin);

        while (!running) {
            int menuChoice = mainUI();

            switch (menuChoice) {
                case 1:
                    showBalance();
                case 2:
                    deposit();
                case 3:
                    withdraw();
                case 4:
                    changePin();
                case 5:
                    showTransactionHistory();
                case 6:
                    logOut();
                    break;
                default:
                   System.out.println("Invalid menu choice, please try again.");
            }
        }
    }

    public static void newLine() {
        System.out.println();
    }

    // Stores options for main in a list, and displays it.
    public static int mainUI() {
        return 0;
    }

    // Checks for password, and lets user log into the account.
    public static boolean logIn() {
        System.out.print("Please enter your PIN: ");
        int pinInput = scanner.nextInt();
        newLine();

        return pinInput == basePin;
    }

    // Logs user out of the account.
    public static void logOut() {
        System.out.println("Thank you! Exiting...");
    }

    // Allows user to change basePin, while in the program.
    public static void changePin() {
        while (true) {
            System.out.print("Please enter your current PIN: ");
            newLine();

            if (!scanner.hasNextInt()) {

                System.out.println("Invalid PIN, please try again.");
                continue;
            }

            int pinInput = scanner.nextInt();
            scanner.next();

            if (pinInput != basePin) {

                System.out.println("Incorrect PIN, please try again.");
                continue;
            }

            while (true) {
                System.out.print("Enter a new PIN: ");
                newLine();

                if (!scanner.hasNextInt()) {

                    System.out.println("Invalid PIN, please try again.");
                    continue;
                }

                int pinChange = scanner.nextInt();
                scanner.next();

                if (pinChange >= 1000 && pinChange <= 9999) {
                    basePin = pinChange;

                    System.out.println("PIN changed successfully.");
                    return;
                } else {

                    System.out.println("PIN must be exactly 4 digits.");
                    continue;
                }
            }
        }
    }

    // Prints user's current balance.
    public static void showBalance() {
    }

    // Allows user to input deposit amount into the account.
    public static void deposit() {
    }

    // Allows user to input withdraw amount out of the account.
    public static void withdraw() {
    }

    // Prints deposits and withdrawals in transactions list.
    public static void showTransactionHistory() {
    }

    // Fetches and adds timestamp to transaction history.
    public static void getTime() {
    }
}
