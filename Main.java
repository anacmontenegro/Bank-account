public class Main {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        String clientName;
        float amount = 0;
        int options = 0;
        float depositMoney = 0;
        float withdrawMoney = 0; 

        System.out.println("Client's name: ");
        clientName = reading.next();
        System.out.println("Initial amount of money: ");
        amount = reading.nextFloat();
        System.out.println("Welcome to your bank account, " + clientName + "!");

        while (options != 4) {
            System.out.println("Choose an option:\n1 - Current Balance\n2 - Deposit\n3 - Withdraw\n4 - Exit");
            options = reading.nextInt();

            if (options == 1) { 
                System.out.println("Your current balance is: " + amount + ".");
            } else if (options == 2) {
                System.out.println("How much money do you wish to deposit? ");
                depositMoney = reading.nextFloat();
                amount = amount + depositMoney;
                System.out.println("You have deposited $" + depositMoney + "." );
            } else if (options == 3) {
                System.out.println("How much money do you wish to withdraw? ");
                withdrawMoney = reading.nextFloat();
                if (withdrawMoney > amount) {
                    System.out.println("You do not have enough funds to proceed.");
                } else {
                    amount = amount - withdrawMoney;
                    System.out.println("You have withdrawn $" + withdrawMoney + ".");
                }
            } else if (options == 4) {
                System.out.println("Until next time, " + clientName + "!");
            } else {
                System.out.println("Invalid option.");
            }
        }  
    }
}
