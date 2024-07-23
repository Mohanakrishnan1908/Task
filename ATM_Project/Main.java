package ATMProject;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.0); // Initial balance of $500
        ATM atm = new ATM(account);
        atm.displayMenu();
    }
}

