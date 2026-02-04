import java.util.ArrayList;

public class AtmSimulator {

    // Stores the balance of the account.
    static int balance = 10000;
    // A list of all the transactions made, able to print it.
    static ArrayList<String> transactions = new ArrayList<>();
    // Stores the user's PIN
    static int password = 1234;

    public static void main(String[] args) {
        System.out.println("Hello World, this is the first commit!");
    }

    // Stores options for main in a list, and displays it.
    public static int mainUI() {
        return 0;
    }

    // Checks for password, and lets user log into the account.
    public static boolean LogIn() {
        return true;
    }

    // Logs user out of the account.
    public static boolean logOut() {
        return false;
    }

    // Prints user's current balance.
    public static void showBalance() {
    }

    // Allows user to input deposit amount into the account.
    public static void deposit(int balance) {
    }

    // Allows user to input withdraw amount out of the account.
    public static void withdraw(int balance) {
    }



}
