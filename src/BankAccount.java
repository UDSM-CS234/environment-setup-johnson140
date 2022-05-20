import java.util.Scanner;
 public class BankAccount {
    static void Account()
    {
        int accountNo;
        System.out.println(" INVALID choice of number");
        System.out.println("===========================================");
        System.out.println("PLEASE CHOOSE AN ACCOUNT");
        System.out.println("1. Account one (SILVER) ");
        System.out.println("2. Account two (GOLD) ");
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("Enter your choice: ");
        accountNo =scanner.nextInt();
        System.out.println(" ");
        System.out.println("_________________________________________________ ");
        switch(accountNo)
        {
            case 1 -> {
                System.out.println(" WELCOME TO CCB SILVER ACCOUNT ");
                        System.out.println(" ");
                Banking b = new Banking();
                b.initiate();
            }
            case 2 -> {
                System.out.println(" WELCOME TO CCB GOLD ACCOUNT ");
                System.out.println(" ");
                Banking b = new Banking();
                b.initiate();
            }
            default -> Account();
        }
    }
    static void Accounts()
    {
        int accountNo;
        System.out.println("==========================================");
        System.out.println("'WELCOME TO THE CHELSEA COOPERATIVE BANK' ");
        System.out.println("==========================================");
        System.out.println("PLEASE CHOOSE AN ACCOUNT");
        System.out.println("1. Account one (SILVER) ");
        System.out.println("2. Account two (GOLD) ");
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("Enter your choice: ");
        accountNo =scanner.nextInt();
        System.out.println(" ");
        System.out.println("_________________________________________________");
        switch(accountNo)
        {
            case 1 -> {
                System.out.println(" WELCOME TO CCB SILVER ACCOUNT ");
                        System.out.println(" ");
                Banking b = new Banking();
                b.initiate();
            }
            case 2 -> {
                System.out.println(" WELCOME TO CCB GOLD ACCOUNT ");
                        System.out.println(" ");
                Banking b = new Banking();
                b.initiate();
            }
            default -> Account();
        }
    }
    public static void main(String[] args) {
        Accounts();
    }
}
class Banking {
    int amount = 1000;
    public void initiate() {
        Login login = new Login();
        try {
            login.acceptInput();
            login.verify();
        } catch (Exception e) {
            try {
                login.acceptInput();
                login.verify();
            } catch (Exception ignored) {
            }
        }
    }
    public int getBalance() {
        return amount;
    }
    public void add(int amt) {
        amount = amount + amt;
        System.out.println(" ");
        System.out.println(" 'AMOUNT DEPOSITED SUCCESSFULLY!' ");
        System.out.println(" ");
        System.out.println("Total Balance: " + amount);
        System.out.println(" ");
    }
    public void withdraw(int amt) {
        System.out.println(" ");
        if (amount < amt) {
            InvalidBankTransaction invalidWithDraw = new
                    InvalidBankTransaction("INSUFFICIENT FUNDS");
            System.out.println(invalidWithDraw.getMessage());
        } else {
            amount = (amount - amt);
            System.out.println(" 'WITHDRAW SUCCESSFUL!' ");
            System.out.println(" ");
            System.out.println("Please Collect your " + amt + " Tshs");
                    System.out.println(" ");
            System.out.println("Total Balance: " + amount + " Tshs");
            System.out.println(" ");
        }
    }
}
class Login {
    int ac_number = 1234;
    int ac_pass = 9999;
    int ac;
    int pw;
    public void acceptInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the account number:");
        ac = scanner.nextInt();
        System.out.println(" ");
        System.out.print("Enter the Password:");
        pw = scanner.nextInt();
    }
    public void verify() throws Exception {
        if (ac == ac_number && pw == ac_pass) {
            System.out.println(" ");
            System.out.println(" " + "LOGIN SUCCESSFUL!");
            new Banking();
            Menu menu = new Menu();
            menu.showMenu();
        } else {
            InvalidBankTransaction loginfailed = new
                    InvalidBankTransaction("Incorrect login credentials");
            System.out.println(loginfailed.getMessage());
            throw loginfailed;
        }
    }
}
class Menu {
    int selectedOption;
    Banking banking = new Banking();
    public void showMenu() {
        System.out.println("____________________ WELCOME ________________________");
                System.out.println(" ");
        System.out.println("------MENU------:");
        System.out.println(" ");
        System.out.println("1. DEPOSIT");
        System.out.println("2. WITHDRAW");
        System.out.println("3. VIEW BALANCE");
        System.out.println("(Press any key to RE-LOGIN)");
        System.out.println(" ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of the option you want: ");
                selectedOption = scanner.nextInt();

        System.out.println("_______________________________________________________")
        ;
        switch (selectedOption) {
            case 1 -> {
                Deposit d = new Deposit();
                int depamt = d.userInput();
                banking.add(depamt);
                showMenu();
            }
            case 2 -> {
                System.out.println("_______________ WITHDRAW __________________");
                        System.out.println(" ");
                System.out.print("Please Enter the amount to withdraw:");
                int withamt = scanner.nextInt();
                banking.withdraw(withamt);
                showMenu();
            }
            case 3 -> {
                System.out.println("_______________ BALANCE __________________");
                        System.out.println(" ");
                System.out.println("Your Account Balance is " +
                        banking.getBalance() + " Tshs");
                System.out.println(" ");
                showMenu();
            }
            default -> {
                System.out.println("Transaction Ended");
                System.exit(0);
            }
        }
    }
}
class Deposit {
    int amt = 0;
    public int userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("_______________ DEPOSIT _________________");
                System.out.println(" ");
        System.out.print("Enter the amount to be deposited: ");
        amt = scanner.nextInt();
        if (amt <= 0) {
            InvalidBankTransaction depositnegativeError = new
                    InvalidBankTransaction("INVALID DEPOSIT AMOUNT");
            System.out.println(depositnegativeError.getMessage());
            userInput();
        } else {
            return amt;
        }
        return amt;
    }
}
class InvalidBankTransaction extends Exception {
    String errorMessage;
    public InvalidBankTransaction(String message) {
        errorMessage = message;
    }
    public String getMessage() {
        return errorMessage;
    }
}
