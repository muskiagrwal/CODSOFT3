import java.util.Scanner;

class ATM {
    public static void main(String[]args){
        int balance =200000, withdraw, deposit;
        Scanner sc=new Scanner(System.in);

        while (true) {
            System.out.println("ATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("balance:"+balance);
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("Enter money to deposit amount:");
                    deposit=sc.nextInt();
                    balance=balance + deposit;
                    System.out.println("your money has been sucessfully deposited:");
                    System.out.println("");
                    break;
                case 3:
                    System.out.print("Enter the withdrawal amount:");
                    withdraw=sc.nextInt();
                    if(balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("please collect your money");
                    }
                    else{
                        System.out.println("insufficient balace");
                    }
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}





